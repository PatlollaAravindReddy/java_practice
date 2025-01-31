package coreJavaPractice.pojo;

public class mainprogram {
    public static void main(String[] args) {
        Employee ee = new Employee();
        ee.setId(1);
        ee.setName("arav");
        ee.setSalary(456789);

        System.out.println(ee.getId() + " - " + ee.getName() + " - " + ee.getSalary() );
    }
}
