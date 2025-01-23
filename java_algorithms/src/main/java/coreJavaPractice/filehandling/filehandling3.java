package coreJavaPractice.filehandling;

import java.io.*;
import java.util.Scanner;

public class filehandling3 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\19049\\Videos\\Testing\\resume.txt");
        if(!f1.exists()) {
            f1.createNewFile();
        }
        FileReader fil = new FileReader(f1);
        int asc;
        String s = "";
        while ((asc = fil.read()) != -1) {
            s = s + String.valueOf((char) asc);
            System.out.print((char) asc);
        }
        System.out.println("    ");
        System.out.print(s);


        BufferedReader buffil = new BufferedReader(fil);
        String line = "";
        String output = "";
        while ((line = buffil.readLine()) != null) {
            output = output + line + "\n";
        }
        System.out.println("    ");
        System.out.print(output);
        buffil.close();
        fil.close();
    }
}
