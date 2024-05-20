package section13.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

class MyFileClass implements AutoCloseable{
    private final int num;

    public MyFileClass(int num){
        this.num = num;
    }
    @Override
    public void close() throws Exception {
        System.out.println("Closing MyFileClass #" + num);
    }
}

class Door implements AutoCloseable{

    @Override
    public void close() throws IllegalStateException {
        System.out.println("Trying to close door resource");
        throw new IllegalStateException("The door does not close");
    }
}
public class TryWithResources {
    /*
    //with manual try catch to handle file closing
    private static void readFile(File fileName){
        FileInputStream is = null;

        try{
            is = new FileInputStream(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static void readFileWithAutomaticResourceManagement(File fileName){
        try(FileInputStream is = new FileInputStream(fileName)){
            byte[] contents = is.readAllBytes();
            System.out.println(new String(contents, StandardCharsets. UTF_8));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //the resource is closed automatically
        //implicit finally block
    }
     */

    /*
    private static void readMultipleFilesWithCustomResourceHandler(){
        try(MyFileClass bookReader = new MyFileClass(1);
        MyFileClass movieReader = new MyFileClass(2)){
            System.out.println("try block");
            throw new RuntimeException();
        }catch(Exception e){
            System.out.println("catch block");
        }finally {
            System.out.println("finally block");
        }
    }
     */

    private static void openDoor(){
        try(Door d = new Door()){
            System.out.println("Reading contents from door resource");
            throw new IllegalStateException("Something is wrong");
        }
        catch(IllegalStateException e){
            System.out.println("Caught: " + e.getMessage());

            for(Throwable t: e.getSuppressed())
                System.out.println("Suppressed: " + t.getMessage());
        }
    }

    public static void main(String[] args) {
        /*
        File f = new File("C:\\Users\\dhruv\\OneDrive\\Desktop\\Debt Owed.txt");
        readFileWithAutomaticResourceManagement(f);
         */

        //readMultipleFilesWithCustomResourceHandler();

        openDoor();
    }
}
