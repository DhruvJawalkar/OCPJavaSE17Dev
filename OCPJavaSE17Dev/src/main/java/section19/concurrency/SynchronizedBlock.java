package section19.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedBlock {
    /*
    private static final Object obj = new Object();
    private static void doSomething(){
        System.out.println(Thread.currentThread().getName() + " entered doSomething()");

        synchronized (obj){
            System.out.println(Thread.currentThread().getName() + " inside the synchronized block");
            int a = 2, b = 2;

            var result = a+b;

            System.out.println(result);
        }
    }
     */

    /*
    private synchronized static void doSomething2(){
        System.out.println(Thread.currentThread().getName() + " inside the synchronized method doSomething2()");
        int a = 2, b = 2;

        var result = a+b;

        System.out.println(result);
    }
     */

    private static final Lock lock = new ReentrantLock();
    private static void doSomething3(){
        try{
            System.out.println(Thread.currentThread().getName() + " entered doSomething3()");
            lock.lock();
            System.out.println(Thread.currentThread().getName() + " acquired lock");
            //do something
            int a = 2, b = 2;
            int result = a + b;
            System.out.println(result);
        }
        finally {
            System.out.println(Thread.currentThread().getName() + " releasing lock");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        /*
        Runnable task = () ->{
            doSomething();
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
         */

        /*
        Runnable task2 = () ->{
            System.out.println(Thread.currentThread().getName() + " calling doSomething2()");
            doSomething2();
        };

        Thread t1 = new Thread(task2);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
         */

        Runnable task3 = () ->{
            System.out.println(Thread.currentThread().getName() + " calling doSomething3()");
            doSomething3();
        };

        Thread t1 = new Thread(task3);
        Thread t2 = new Thread(task3);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
