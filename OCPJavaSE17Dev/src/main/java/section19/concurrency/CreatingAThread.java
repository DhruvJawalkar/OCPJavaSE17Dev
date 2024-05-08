package section19.concurrency;

/*
class MyClass extends Thread{
    @Override
    public void run(){
        System.out.println("Thread '" + getName() + "' is being executed. (from MyClass)");
    }
    public static void main(String[] args) {
        MyClass thread1 = new MyClass();
        thread1.start();

        System.out.println("Thread '" + Thread.currentThread().getName() + "' is being executed.");
    }
}
*/
/*
class MyRun implements Runnable{
    public void run(){
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is being executed. (from MyClass)");
    }

    public static void main(String[] args){
        MyRun r = new MyRun();
        new Thread(r).start();
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is being executed.");
    }
}
 */

class MyRun{
    public static void main(String[] args) {
        Thread r = new Thread(() -> System.out.println("Thread '" + Thread.currentThread().getName() + "' is being executed."));
        r.start();

        System.out.println(Thread.currentThread().getName() + " from main");
    }
}