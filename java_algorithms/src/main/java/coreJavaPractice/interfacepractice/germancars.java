package coreJavaPractice.interfacepractice;

public class germancars implements cars{

    @Override
    public void colour() {
        System.out.println("blue");
    }

    @Override
    public void gearBox() {
        System.out.println("manual");
    }

    @Override
    public void width() {
        System.out.println("4 m");
    }

    @Override
    public void price() {
        System.out.println("10000");
    }

    @Override
    public void seatCount() {
        System.out.println("8");
    }

}
