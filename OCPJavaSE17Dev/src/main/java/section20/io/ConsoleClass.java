package section20.io;

import java.io.Console;
import java.util.Arrays;

public class ConsoleClass {
    public static void main(String[] args) {
        Console console = System.console();

        if(console != null){
            String myName = console.readLine("What is your name? ");
            console.format("Hello, %s!%n", myName);
            console.writer().println("-".repeat(30));

            char[] password = console.readPassword("Please enter your password: ");
            char[] verifyPassword = console.readPassword("Please verify the password: ");

            if(Arrays.equals(password, verifyPassword))
                console.printf("Password set successfully%n");
            else
                console.printf("ERROR: Passwords do not match!%n");
        }
        else{
            System.err.println("Console unavailable!");
        }
    }
}
