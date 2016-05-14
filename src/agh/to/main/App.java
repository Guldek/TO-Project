package agh.to.main;

public class App
{
    public static void main(String[] args) {
        System.out.println( "Hello World!" );
        CarFactory.setEngine(0);
        CarFactory.setModel(0);
        CarFactory.addOption(0);
        Car c = CarFactory.createCar();
        c.description();
    }
}
