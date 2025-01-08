package coreJavaPractice.inheritance;

public class interfaceinheritance implements interfaceadmin {
    public static void main(String[] args) {
        interfaceinheritance ii = new interfaceinheritance();
        ii.read();
        ii.write();
        ii.manage();
    }

    @Override
    public void read() {
        System.out.println("read");
    }

    @Override
    public void write() {
        System.out.println("write");
    }

    @Override
    public void manage() {
        System.out.println("manage");
    }
}
