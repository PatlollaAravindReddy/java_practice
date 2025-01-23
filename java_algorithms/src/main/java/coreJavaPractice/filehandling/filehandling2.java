package coreJavaPractice.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class filehandling2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\19049\\Videos\\Testing\\resume.txt");
        if(!f1.exists()) {
            f1.createNewFile();
        }
        FileInputStream fil = new FileInputStream(f1);
        int asc;
        String s = "";
        while ((asc = fil.read()) != -1) {
            s = s + String.valueOf((char) asc);
          //  System.out.print((char) asc);
        }
        System.out.println();
       // System.out.print(s);
        fil.close();

        Scanner ss = new Scanner(f1);
        String output = new String();
        while(ss.hasNextLine()) {
            output = output + ss.nextLine() + "\n";
        }
        System.out.println(output);
        ss.close();
    }
}
