package designpatterns.strategydesignpattern.withdesignpattern;

public class passengervehicle extends vehicle {
    passengervehicle() {
        super(new normalperformance());
    }
}
