package coreJavaPractice.multithreading;

public class testmultithreading {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread();
        t1.start();
        System.out.println(Thread.activeCount());
        Employee ee = new Employee();
        ee.start();
    }
}

class Employee extends Thread {

    @Override
    public void run() {
        System.out.println("hello");
    }
}
