package section3.operators;

public class ComparisonOperators {
    private static void isInteger(Number num){
        if(num instanceof Integer){
            System.out.println(num + " " + "is instance of Integer");
        }
        else{
            System.out.println(num + " " + "is not an instance of Integer");
        }
    }
    public static void main(String[] args) {
        isInteger(5);
        isInteger(3.14);

        System.out.println(null instanceof Object);
        //System.out.println(null instanceof null);
    }
}
