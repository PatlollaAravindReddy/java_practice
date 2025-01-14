package coreJavaPractice.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class filehandling {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\19049\\Videos\\Testing\\resume.txt");
        if(f.exists()) {
            f.delete();
        }
        System.out.println(f.createNewFile());
        System.out.println(f.canWrite());
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.isHidden());
        System.out.println(f.setWritable(true));
        File f1 = new File(f.getParent());
        System.out.println(Arrays.toString(f1.list()));
        System.out.println(Arrays.toString(f1.listFiles()));
        File f2 = new File(f.getParent() + "./resume2.doc");
        System.out.println(f2.createNewFile());
        File f3 = new File("./resourcesss/resume/");
        System.out.println(f3.mkdirs());
        File f4 = new File("./resour");
        System.out.println(f4.mkdir());
        System.out.println(new Date(f.lastModified()));
    }
}
