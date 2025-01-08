package coreJavaPractice.interfacepractice;

public interface cars {
    public void colour();
    public void gearBox();
    public void width();
    public void price();

    default void seatCount() {
        commons();
        System.out.println("4");
    }

    static void audio() {
        commons();
        System.out.println("abs sound system");
    }

    private static void commons() {
        System.out.println("6 - Airbags");
        System.out.println("ADAS");
    }
}
