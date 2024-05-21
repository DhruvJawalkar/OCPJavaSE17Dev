package Section6.arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] a = {{0}, {1,2}, {3,4,5}};

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                System.out.println("a(%d, %d) = %d".formatted(i, j, a[i][j]));

        for (int[] row : a)
            for (int element : row)
                System.out.println("element = " + element);
    }
}
