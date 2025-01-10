package coreJavaPractice.polymorphism;

public class laptop {
    public void harddisk(int speed) {
        System.out.println("speed : " + speed);
    }

    public void harddisk(int readspeed, int writespeed) {
        System.out.println("readspeed : " + readspeed + " writespeed : " + writespeed);
    }
}