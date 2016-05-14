package agh.to;

import agh.to.carfactory.Car;
import agh.to.carfactory.CarFactory;

import javax.smartcardio.Card;
import java.util.Scanner;

public class App{

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while(true) {
            CarFactory factory = new CarFactory();
            factory.printEngines();
            scanner.nextInt();
            factory.setEngine(0);
            System.out.println();
            factory.printModels();
            scanner.nextInt();
            factory.setModel(0);
            System.out.println();
            scanner.nextInt();
            factory.printOptions();
            scanner.nextInt();
            factory.addOption(0);
            System.out.println();
            factory.createCar().description();
        }
    }
}
