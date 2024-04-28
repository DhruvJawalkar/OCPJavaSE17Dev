package section11.lambdas.and.functional.programming;

import java.util.function.Predicate;

public class PredicateWithLambda {
    static void myProbe(int n, Predicate<Integer> predicate){
        if(predicate.test(n))
            System.out.println("Test passed");
        else
            System.out.println("Test failed");
    }

    public static void main(String[] args){
        /*
        Predicate<Integer> gt10 = n -> n > 10;

        System.out.println(gt10.test(11));
        System.out.println(gt10.test(9));
         */

        myProbe(5, n -> n > 2);
        myProbe(5, n -> n % 2 == 0);

        Predicate<Integer> myCriterium = n -> n*n + 5 > 100;
        myProbe(7, myCriterium);
        myProbe(11, myCriterium);
    }
}
