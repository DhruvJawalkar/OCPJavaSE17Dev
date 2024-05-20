package section13.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/*
class Student {
    private int id;
    private String fullName;

    public Student(int id, String fullName){
        if(id < 10 || fullName.length() > 100){
            throw new IllegalArgumentException();
        }

        this.id = id;
        this.fullName = fullName;
    }

    public int getId(){
        return id;
    }

    public String getFullName(){
        return fullName;
    }
}
 */
class OutOfMilkException extends Exception{}
public class HandlingExceptions {

    private static void readFirstByteFromFile(File fileName){
        try {
            FileInputStream file = new FileInputStream(fileName);
            byte[] contents = file.readAllBytes();

            //byte x = (byte) file.read();
            //System.out.print((char) x);

            System.out.println(new String(contents, StandardCharsets. UTF_8));
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            //e.printStackTrace();
            System.out.println("File not found, stack trace: ");
            e.printStackTrace();
        } catch (IOException | NumberFormatException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
        finally {
            System.out.println("Running readFirstByteFromFile...");
        }
    }


    /*
    private static void printFourthElement(int[] a){
        try{
            System.out.println(a[3]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            //e.printStackTrace();
            System.out.println("There is no fourth element in the array. Sorry.");
        }
    }
     */

    private static void getMilk() throws OutOfMilkException{
        System.out.println("Getting milk...");
        throw new OutOfMilkException();
    }
    public static void main(String[] args) throws OutOfMilkException {
        /*
        File f = new File("C:\\Users\\dhruv\\OneDrive\\Desktop\\Debt Owed.txt");
        readFirstByteFromFile(f);
         */

        /*
        int[] a = new int[]{1, 2, 3};
        printFourthElement(a);
         */

        //Student student = new Student(1, "John Wayne");

        //getMilk();

        File f = new File("C:\\Users\\dhruv\\OneDrive\\Desktop\\Debt Owed.txt");
        readFirstByteFromFile(f);
    }
}
