package designpatterns.strategydesignpattern.withdesignpattern;

public class sportsvehicle extends vehicle{
    sportsvehicle() {
        super(new specialperformance());
    }
}
