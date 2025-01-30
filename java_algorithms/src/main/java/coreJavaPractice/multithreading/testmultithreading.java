package coreJavaPractice.multithreading;

public class testmultithreading {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread();
        t1.start();
        System.out.println(Thread.activeCount());
        Employee ee = new Employee("T1");
        ee.start();
        Manager mn = new Manager("T2");
        mn.start();
    }
}

class Employee extends Thread {
    public Employee(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Hello : " + Thread.currentThread().getName());
    }
}

class Manager extends Thread {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Hi : " + Thread.currentThread().getName());
    }
}
