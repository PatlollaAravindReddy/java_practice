package coreJavaPractice.pojo;

public class mainprogram {
    public static void main(String[] args) {
        Employee ee = new Employee();
        ee.setId(1);
        ee.setName("arav");
        ee.setSalary(456789);

        System.out.println(ee.getId() + " - " + ee.getName() + " - " + ee.getSalary() );


        javabeanclass jb = new javabeanclass();
        jb.setId(2);
        jb.setName("sai");
        jb.setSalary(456768);

        System.out.println(jb.getId() + " - " + jb.getName() + " - " + jb.getSalary() );
    }
}
