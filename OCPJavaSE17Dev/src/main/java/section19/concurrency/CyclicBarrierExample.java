package section19.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        /*
        CyclicBarrier barrier = new CyclicBarrier(3); // Barrier for 3 parties

        Runnable workerTask = () -> {

            String name = Thread.currentThread().getName();
            System.out.println(name + " is performing the first part of the work.");

            try {
                barrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            }

            // code to follow will be performed only after 3 threads finish with the execution of the code above

            System.out.println(name + " is performing the remaining work after the barrier.");
        };

        Thread worker1 = new Thread(workerTask, "Worker 1");
        Thread worker2 = new Thread(workerTask, "Worker 2");
        Thread worker3 = new Thread(workerTask, "Worker 3");
        Thread worker4 = new Thread(workerTask, "Worker 4");

        worker1.start();
        worker2.start();
        worker3.start();
        worker4.start();
         */

        CyclicBarrier barrier = new CyclicBarrier(3, () -> {
            System.out.println("About to release barrier");
        });
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " completed part 1");

            try {
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + " performing rest of the work");
        };

        Thread t1 = new Thread(task, "Worker 1");
        Thread t2 = new Thread(task, "Worker 2");
        Thread t3 = new Thread(task, "Worker 3");
        Thread t4 = new Thread(task, "Worker 4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
