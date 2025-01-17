package designpatterns.strategydesignpattern.withdesignpattern;

public class specialperformance implements drive{
    @Override
    public void performance() {
        System.out.println("special performance");
    }
}
