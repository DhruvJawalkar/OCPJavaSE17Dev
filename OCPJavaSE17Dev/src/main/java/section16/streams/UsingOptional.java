package section16.streams;

import java.util.Optional;

public class UsingOptional {
    private static Optional<Double> average(int... numbers){
        if(numbers.length==0)
            return Optional.empty();

        int sum = 0;
        for(int num : numbers){
            sum += num;
        }

        double result = ((double) sum ) / numbers.length;

        return Optional.of(result);
    }

    public static void main(String[] args){
        /*
        Optional<Double> myOptional = average(1,2,3);

        if(myOptional.isPresent())
            System.out.println(myOptional.get());
        //myOptional.ifPresent(System.out::println);

        Optional<Double> emptyOptional = average();
        System.out.println(emptyOptional.get());
         */

        /*
        Integer value = null;
        Optional myOptional = (value == null) ? Optional.empty() : Optional.of(value);
        Optional myNullOptional = Optional.ofNullable(value);
         */

        /*
        Optional<Double> myOpt = average(1,2,3);
        myOpt.ifPresent(System.out::println);
         */

        Optional<Double> myOptional = average();
        /*
        System.out.println(myOptional.orElse(Double.NaN));
        System.out.println(myOptional.orElseGet(() -> Math.random()));
         */

        //myOptional.orElseThrow();
        myOptional.orElseThrow(()-> new IllegalStateException());
    }
}
