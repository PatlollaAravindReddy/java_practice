package coreJavaPractice.inheritance;

public class developer extends guest {
    public void write() {
        super.read();
        System.out.println("write");
    }

    public void read() {
        System.out.println("class level read");
    }
}
