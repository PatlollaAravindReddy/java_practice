package designpatterns.strategydesignpattern.withoutdesignpattern;

public class offroadvehicle extends vehicle{
    @Override
    public void drive() {
        System.out.println("special performance");
    }
}
