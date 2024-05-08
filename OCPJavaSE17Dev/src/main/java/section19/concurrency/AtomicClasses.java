package section19.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClasses {
    /*
    private final static int budget = 2;
    private static AtomicInteger requestCount = new AtomicInteger(0);
     */

    private static AtomicInteger counter = new AtomicInteger(0);
    public static void main(String[] args) {
        /*
        Runnable webRequest = () ->{
            int curCount = requestCount.incrementAndGet();

            if(curCount <= budget)
                System.out.println("Allowing current request, updated used token count = " + curCount);
            else
                System.out.println("Blocked current request as current request count = " + requestCount.get());
        };

        ExecutorService service = Executors.newFixedThreadPool(4);
        for(int i=0; i<10; i++){
            service.submit(webRequest);
        }

        service.shutdown();
         */

        Thread t1 = new Thread(() ->{
           for(int i=0; i<1000; i++){
               counter.getAndIncrement();
           }
        });

        Thread t2 = new Thread(() ->{
            for(int i=0; i<1000; i++){
                counter.getAndIncrement();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.get());
    }
}
