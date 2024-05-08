package section19.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentCollections {
    public static void main(String[] args) {
        ConcurrentMap<Integer, Integer> map = new ConcurrentHashMap<>();

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(3000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("value for key '0' before put in t1 : " + map.getOrDefault(0, -1));

            map.put(0, 0);
            System.out.println("value for key '0' after put in t1: " + map.get(0));
        });

        Thread t2 = new Thread(() -> {
            System.out.println("value for key '0' before put in t2 : " + map.getOrDefault(0, -1));
            map.put(0, 1000);
            System.out.println("value for key '0' after put in t2: " + map.get(0));
        });


        //System.out.println("value for key '0' before t1 and t2 start: " + map.get(0));
        try {
            t1.start();
            t2.start();

            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("value for key '0' after put in main: " + map.get(0));
    }
}
