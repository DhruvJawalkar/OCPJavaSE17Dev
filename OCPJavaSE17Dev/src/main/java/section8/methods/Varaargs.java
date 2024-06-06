package section8.methods;

public class Varaargs {
    public static void greet(String greeting, String... names){
        for(String name : names){
            System.out.println(greeting + ", " + name + "!");
        }
    }
    public static void main(String[] args) {
        greet("Hello", "John", "George", "Luke");

        String[] names = {"John", "George"};
        greet("Hello", names);
    }
}
