package section20.io;

import java.io.*;

public class SerializationExample {
    private static void serialize(User user, String fileName){
        try (var out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))){
            out.writeObject(user);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static User deserialize(String fileName){
        try (var in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)))){
            User user = (User) in.readObject();
            return user;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        User user = new User("John Wayne", "mySecretPassword");
        String filename = "C:\\Users\\dhruv\\OneDrive\\Desktop\\Technical Growth\\Java Certification Exam Prep OCP 1Z0-829\\code-samples\\OCPJavaSE17Dev\\src\\main\\java\\section20\\io\\user.ser";
        //file = new File("C:\\Users\\dhruv\\OneDrive\\Desktop\\Technical Growth\\Java Certification Exam Prep OCP 1Z0-829\\code-samples\\OCPJavaSE17Dev\\src\\main\\java\\section20\\io\\user.ser");

        serialize(user, filename);
        System.out.println(deserialize(filename).toString());
    }
}
