package section15.beyond_classes;

public class PrintArea {
    private int a = 10;
    public void calculateArea() {
        final int b = 15;
        class Computer {
            public void multiply() {
                System.out.println(a*b);
            }
        }
        var computer = new Computer();
        computer.multiply();
    }
    public static void main(String[] args) {
        var printArea = new PrintArea();
        printArea.calculateArea();
    }
}
