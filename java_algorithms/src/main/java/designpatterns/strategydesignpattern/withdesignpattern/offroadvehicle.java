package designpatterns.strategydesignpattern.withdesignpattern;

public class offroadvehicle extends vehicle {
    offroadvehicle() {
        super(new specialperformance());
    }
}
