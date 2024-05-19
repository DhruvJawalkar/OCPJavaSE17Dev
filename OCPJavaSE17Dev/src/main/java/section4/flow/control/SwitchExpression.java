package section4.flow.control;

public class SwitchExpression {
    private static void greet(int a){
        /*
        switch(a){
            case 0, 1, 2:
                System.out.println("Good day");
                break;
            case 3, 4:
                System.out.println("Hi");
                break;
            default:
                System.out.println("Hello");
                break;
        }
         */

        /*
        switch(a){
            //case 0, 1, 2 -> System.out.println("Good day");
            case 0, 1, 2 -> {
                var isOk = true;
                System.out.println("Good day");
            }
            case 3, 4 -> System.out.println("Hi");
            default -> System.out.println("Hello");
        }
         */
    }

    enum Compass {NORTH, SOUTH, EAST, WEST};
    private static String getDirection(Compass direction){
        return switch(direction){
            case NORTH -> "Up";
            case SOUTH -> "Down";
            case EAST -> "Right";
            case WEST -> "Left";
            default -> "Unknown";
        };
    }
    public static void main(String[] args) {
        /*
        int a = 1;
        String greeting = switch(a) {
            //case 0, 1, 2 -> "Good day";
            case 0, 1, 2 -> {
                String str1 = "Good";
                String str2 = "day";

                yield str1 + " " + str2;
            }
            case 3, 4 -> "Hi";
            default -> "Hello";
        };

        System.out.println(greeting);
         */

        System.out.println(getDirection(Compass.NORTH));

    }
}
