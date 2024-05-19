package section4.flow.control;

public class WhileLoop {
    public static void main(String[] args) {
        // using break in nested loops, with labels
        int i = 0, j = 0;
        OUTER_LOOP: while (true) {
            i++;
            j = 0;
            INNER_LOOP: while (true) {
                j++;
                System.out.print("(" + i + ", " + j + ") ");
                if (j == 3) break OUTER_LOOP;
            }
        }

    }
}
