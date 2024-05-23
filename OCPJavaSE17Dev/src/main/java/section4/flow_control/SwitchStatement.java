package section4.flow_control;

public class SwitchStatement {
    private static void greet(int a){
        //boolean b = true;
        //long l = 1L;
        //double, float

        /*
        switch(a){
            case 0:
                System.out.println("Good morning");
                //break;
                break;
            case 1:
                System.out.println("Good afternoon");
                //break;
                break;
            case 2:
                System.out.println("Good evening");
                //break;
                break;
            default:
                System.out.println("Hello");
                //break;
                break;
        }

        switch(a){
            case 0: case 1: case 2:
                System.out.println("Good day");
                break;
            default:
                System.out.println("Hello");
                break;
        }
         */
        switch(a){
            case 0:
                System.out.println("Good morning");
                //break;
            default:
                System.out.println("Hello");
                //break;
            case 1:
                System.out.println("Good afternoon");
                //break;
            case 2:
                System.out.println("Good evening");
                //break;
        }
    }
    public static void main(String[] args) {
        //greet(1);
        //greet(7);

        greet(3);

    }
}
