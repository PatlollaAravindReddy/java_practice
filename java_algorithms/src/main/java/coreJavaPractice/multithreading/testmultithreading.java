package coreJavaPractice.multithreading;

public class testmultithreading {
    public static void main(String[] args) throws Exception {
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
        Employee2 em2 = new Employee2();
        Thread t2 = new Thread(em2, "T3");
        t2.start();
        Manager2 mn2 = new Manager2();
        Thread t3 = new Thread(mn2, "T4");
        t3.start();

        Runnable rn = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello : " + Thread.currentThread().getName());
            }
        };

        Thread t5 = new Thread(rn, "T5");


        Runnable rn1 = () -> System.out.println("Hello : " + Thread.currentThread().getName());

        Thread t6 = new Thread(rn1, "T6");



        t5.start();
        //t5.join();      // used when we want to begin t6 after completion of t5
        //t5.sleep(10000);// used to make wait t6 for certain time after t5 (to start t6)
        t6.start();
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

// we are using Runnable interface because we can't extend two classes
// but we can implement more than one interface
class Employee2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello : " + Thread.currentThread().getName());
    }
}

class Manager2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Hi : " + Thread.currentThread().getName());
    }
}