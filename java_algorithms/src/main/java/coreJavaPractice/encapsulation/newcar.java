package coreJavaPractice.encapsulation;

public class newcar {
    public static void main(String[] args) {
        cars cc = new cars();
        cc.setCarname("I-hybrid");
        cc.setPrice(23456);
        System.out.println(cc.getCarname());
        System.out.println(cc.getPrice());
    }
}
