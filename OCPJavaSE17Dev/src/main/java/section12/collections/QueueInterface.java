package section12.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<String> colors = new LinkedList<>();
        colors.offer("blue");
        colors.offer("green");
        colors.add("yellow");

        System.out.println(colors);
        System.out.println(colors.peek());
        colors.poll();
        System.out.println(colors);
        colors.remove();
        System.out.println(colors);
    }
}
