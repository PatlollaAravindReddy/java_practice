package designpatterns.strategydesignpattern.withdesignpattern;

public class vehicle{

    drive drive;

    vehicle(drive drive) {
        this.drive = drive;
    }
    public void drive() {
        drive.performance();
    }
}
