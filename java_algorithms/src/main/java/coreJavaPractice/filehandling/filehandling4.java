package coreJavaPractice.filehandling;

import java.io.*;
import java.util.Scanner;

public class filehandling4 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\19049\\Videos\\Testing\\resumeoutput.txt");
        File f2 = new File("C:\\Users\\19049\\Videos\\Testing\\resumeoutput2.txt");
        File f3 = new File("C:\\Users\\19049\\Videos\\Testing\\resumeoutput4.txt");
        if(f1.exists()) {
            f1.delete();
        }
        String aa = "Hello";
        FileOutputStream fil = new FileOutputStream(f1);
        if(f2.exists()) {
            f2.delete();
        }
        FileWriter fw = new FileWriter(f2);
        fw.write(aa);
//        fil.write(77);
//        fil.write(78);
//        fil.write(79);
//        fil.write(80);
        for (int i = 0; i < aa.length(); i++) {
            fil.write((int) aa.charAt(i));
        }
        fw.close();
        fil.close();

//        if(f3.exists()) {
//            f3.delete();
//        }
        BufferedReader buffil = new BufferedReader(new FileReader(f3));
        String line = "";
        String existingText = "";
        while ((line = buffil.readLine()) != null) {
            existingText = existingText + line + "\n";
        }
        String aaa = "How are you";
        BufferedWriter br = new BufferedWriter(new FileWriter(f3));
        br.write(existingText + aaa);
        br.close();
    }
}
