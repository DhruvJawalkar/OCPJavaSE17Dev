package section15.beyond_classes;

/*
public class A {
    private String str = "Hello!";
    protected class B {
        private static void printOut(String s) {
            System.out.print(s);
        }
        public void printHelloTwice() {
            printOut(str);
            printOut(str);
        }
    }
    public void printTwice() {
        var b = new B();
        b.printHelloTwice();
    }
    public static void main(String[] args) {
        var a = new A();
        a.printTwice();

        var a = new A();
        var b = a. new B();
        b.printHelloTwice();

        //new A(). new B().printHelloTwice();
    }
}
*/

/*
public class A {
    private int t = 1;
    class B {
        private int t = 2;
        class C {
            private int t = 3;
            public void printT() {
                System.out.println(t);
                System.out.println(this.t);
                System.out.println(B.this.t);
                System.out.println(A.this.t);
            }
        }
    }

    // main method
    public static void main(String[] args) {

    // initialize all classes
        A a = new A();
        B b = a.new B();
        B.C c = b.new C();
        c.printT();
    }
}
*/