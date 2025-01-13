package dsa.customstack;

public class stackmain {
    public static void main(String[] args) throws Exception {
        customstack cs = new customstack(10);
        cs.push(10);
        cs.push(12);
        cs.push(14);
        cs.push(16);
        cs.pop();
        cs.push(18);
        System.out.println("peek element - " + cs.peek());
        cs.printElements();

//        customstack ds = new dynamicstack(10);
//        ds.push(10);
//        ds.push(12);
//        ds.push(14);
//        ds.push(16);
//        ds.push(10);
//        ds.push(12);
//        ds.push(14);
//        ds.push(16);
//        ds.push(10);
//        ds.push(12);
//        ds.push(14);
//        ds.push(16);
//        ds.push(10);
//        ds.push(12);
//        ds.push(14);
//        ds.push(16);
//        ds.printElements();
    }
}
