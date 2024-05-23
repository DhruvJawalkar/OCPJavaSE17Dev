package section15.beyond_classes;
/*
Static Nested Class
        • can't access instance variables or methods declared in the outer class
        • you don't need an instance of the wider class to access it
        • can be marked private or protected
 */
public class State {
    static class Town {
        private int type = 1;
    }
    public static void main(String[] args) {
        Town town = new Town();
        System.out.println(town.type);
    }
}
