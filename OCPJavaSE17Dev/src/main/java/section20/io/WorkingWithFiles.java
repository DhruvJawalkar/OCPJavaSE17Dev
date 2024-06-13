package section20.io;

import java.io.*;

public class WorkingWithFiles {
    public static void main(String[] args) {
        /*
        // example: copy text file (no buffering)
        File srcFile = new File("C:\\Users\\dhruv\\OneDrive\\Desktop\\Technical Growth\\Java Certification Exam Prep OCP 1Z0-829\\code-samples\\OCPJavaSE17Dev\\src\\main\\java\\section20\\io\\src.txt");
        File destFile = new File("C:\\Users\\dhruv\\OneDrive\\Desktop\\Technical Growth\\Java Certification Exam Prep OCP 1Z0-829\\code-samples\\OCPJavaSE17Dev\\src\\main\\java\\section20\\io\\dest.txt");

        try(var reader = new FileReader(srcFile);
            var writer = new FileWriter(destFile)
        ){
            int c;
            while((c = reader.read()) != -1){
                writer.write(c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
         */

        /*
        // example: copy text file (with buffering, same files)
        File srcFile = new File("C:\\Users\\dhruv\\OneDrive\\Desktop\\Technical Growth\\Java Certification Exam Prep OCP 1Z0-829\\code-samples\\OCPJavaSE17Dev\\src\\main\\java\\section20\\io\\src.txt");
        File destFile = new File("C:\\Users\\dhruv\\OneDrive\\Desktop\\Technical Growth\\Java Certification Exam Prep OCP 1Z0-829\\code-samples\\OCPJavaSE17Dev\\src\\main\\java\\section20\\io\\dest.txt");

        try(var reader = new BufferedReader(new FileReader(srcFile));
            var writer = new BufferedWriter(new FileWriter(destFile))
        ){
            String line;
            while((line = reader.readLine()) != null){
                writer.write(line);
                writer.newLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
         */

        /*
        // example: copy binary file (no buffering)
        File srcFile = new File("C:\\Users\\dhruv\\OneDrive\\Desktop\\Technical Growth\\Java Certification Exam Prep OCP 1Z0-829\\code-samples\\OCPJavaSE17Dev\\src\\main\\java\\section20\\io\\cat.jpg");
        File destFile = new File("C:\\Users\\dhruv\\OneDrive\\Desktop\\Technical Growth\\Java Certification Exam Prep OCP 1Z0-829\\code-samples\\OCPJavaSE17Dev\\src\\main\\java\\section20\\io\\cat-copy.jpg");

        try(var reader = new FileInputStream(srcFile);
            var writer = new FileOutputStream(destFile)
        ){
            int b;
            while((b = reader.read()) != -1){
                writer.write(b);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
         */

        // example: copy binary file (with buffering, same files)
        File srcFile = new File("C:\\Users\\dhruv\\OneDrive\\Desktop\\Technical Growth\\Java Certification Exam Prep OCP 1Z0-829\\code-samples\\OCPJavaSE17Dev\\src\\main\\java\\section20\\io\\cat.jpg");
        File destFile = new File("C:\\Users\\dhruv\\OneDrive\\Desktop\\Technical Growth\\Java Certification Exam Prep OCP 1Z0-829\\code-samples\\OCPJavaSE17Dev\\src\\main\\java\\section20\\io\\cat-copy.jpg");

        try(var reader = new BufferedInputStream(new FileInputStream(srcFile));
            var writer = new BufferedOutputStream(new FileOutputStream(destFile))
        ){
            byte[] buffer = new byte[1024];
            int numBytesRead;
            while((numBytesRead = reader.read(buffer)) > 0){
                writer.write(buffer, 0, numBytesRead);
                writer.flush();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
