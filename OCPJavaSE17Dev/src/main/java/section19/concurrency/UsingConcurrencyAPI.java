package section19.concurrency;

import java.util.concurrent.*;

public class UsingConcurrencyAPI {
    private static Runnable getRunnableTask(int n){
        Runnable task = () -> {
            var count = 0;
            System.out.println("Starting task" + n);
            for(long i=0; i<10_000_000; i++){
                count++;
            }
            System.out.println("Completed task" + n);
        };

        return task;
    }
    public static void main(String[] args) {
        /*
        ExecutorService service = Executors.newSingleThreadExecutor();

        Future<?> result = service.submit(() -> {
            var count = 0;
           for(long i=0; i<10_000_000; i++){
               count++;
           }
        });

        try {
            var value = result.get(1, TimeUnit.MILLISECONDS);
            if(value==null)
                System.out.println("Task Completed");
        }
        catch(TimeoutException e){
            System.out.println("Task didn't complete in time.");
        }
        catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        service.shutdown();
         */

        /*
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<Integer> result = service.submit(() -> 11*12);

        try {
            int val = result.get();
            System.out.println(val);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            service.shutdown();
        }
         */

        /*
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable taskOne = () -> System.out.println("Hi!");
        Callable<String> taskTwo = () -> "Hi!";

        //service.schedule(taskOne, 3, TimeUnit.SECONDS);
        ScheduledFuture<String> result = service.schedule(taskTwo, 3, TimeUnit.SECONDS);
        try {
            System.out.println(result.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        service.shutdown();
         */

        /*
        Runnable taskOne = () -> System.out.println("Hi!");
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        //service.scheduleAtFixedRate(taskOne,3, 5, TimeUnit.SECONDS);
        //service.shutdown();

        ScheduledFuture<?> result = service.scheduleWithFixedDelay(taskOne, 3, 10, TimeUnit.SECONDS);
        //service.shutdown();
         */

        /*
        //ExecutorService service = Executors.newCachedThreadPool();
        ExecutorService service = Executors.newFixedThreadPool(4);

        for(int i=0; i<8; i++){
            service.submit(getRunnableTask(i));
        }

        service.shutdown();
         */

        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);

        for(int i=0; i<8; i++){
            service.scheduleWithFixedDelay(getRunnableTask(i), 5, 10, TimeUnit.SECONDS);
        }
    }
}
