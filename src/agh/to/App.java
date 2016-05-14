package agh.to;

import agh.to.carfactory.Car;
import agh.to.carfactory.CarFactory;

import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String input="";
        while(!input.equalsIgnoreCase("x")) {
            CarFactory factory = new CarFactory();
            chooseEngine(factory);
            chooseModel(factory);
            chooseOptions(factory);
            factory.createCar().description();
            System.out.println("If you don't want to choose new car, please press x");
            input = scanner.next();
        }
    }
    private static void chooseEngine (CarFactory factory){
        int choose;
        try {
            System.out.println("\nChoose one from this engines");
            factory.printEngines();
            choose = Integer.valueOf(scanner.next());
            factory.setEngine(choose);
        }catch (Exception exception){
            System.out.println("This not a valid number. Try again");
            chooseEngine(factory);
        }
    }

    private static void chooseModel (CarFactory factory){
        int choose;
        try {
            System.out.println("\nChoose one from this models");
            factory.printModels();
            choose = Integer.valueOf(scanner.next());
            factory.setModel(choose);
        }catch (Exception exception){
            System.out.println("This not a valid number. Try again");
            chooseModel(factory);
        }
    }


    private static void chooseOptions (CarFactory factory){
        int choose;
        try {
            System.out.println("\nSelect all the additional options that you want (x to finish)");
            factory.printOptions();
            String input;
            while(!(input = scanner.next()).equalsIgnoreCase("x")) {
                choose = Integer.valueOf(input);
                factory.addOption(choose);
            }
        }catch (Exception exception){
            System.out.println("This not a valid number. Try again");
            chooseOptions(factory);
        }
    }
}
