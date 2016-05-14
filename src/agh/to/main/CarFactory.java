package agh.to.main;

import java.util.LinkedList;
import java.util.List;

public class CarFactory {
    private final static List<Engine> availableEngines = new LinkedList<Engine>();
    private final static List<Option> availableOptions = new LinkedList<Option>();
    private final static List<String> availableModels = new LinkedList<String>();
    private static Engine engine = null;
    private static List<Option> chosenOptions = new LinkedList<>();
    private static String model = null;
    static {
        availableEngines.add(new Engine(1.0f, "gasoline", 10));
        availableEngines.add(new Engine(1.2f, "gasoline", 10));
        availableEngines.add(new Engine(1.4f, "gasoline", 10));
        availableEngines.add(new Engine(1.6f, "gasoline", 10));
        availableEngines.add(new Engine(1.6f, "diesel", 10));
        availableEngines.add(new Engine(1.9f, "diesel", 10));
        availableModels.add("modelA");
        availableModels.add("modelB");
        availableOptions.add(new Option("Air Conditioner",19));
        availableOptions.add(new Option("GPS",19));
    }
    public static void setEngine(int n){
        try{
            engine = availableEngines.get(n);
            System.out.println("Successfully added engine.");
        }
        catch(Exception e){
            System.out.println("Choosing of engine failed.");
        }
    }
    public static void addOption(int n){
        try{
            chosenOptions.add(availableOptions.get(n));
            System.out.println("Successfully added option.");
        }
        catch(Exception e){
            System.out.println("Adding option failed.");
        }
    }
    public static void removeOption(int n){
        try{
            chosenOptions.remove(n);
            System.out.println("Successfully removed option.");
        }
        catch(Exception e){
            System.out.println("Removing option failed.");
        }
    }
    public static void setModel(int n){
        try{
            model = availableModels.get(n);
            System.out.println("Successfully chosen model.");
        }
        catch(Exception e){
            System.out.println("Choosing of model failed.");
        }
    }
    public static Car createCar(){
        List<CarComponent> components = new LinkedList<>();
        if(chosenOptions.size() == 0) throw new NullPointerException();
        components.addAll(chosenOptions);
        if(engine == null) throw new NullPointerException();
        components.add(engine);
        return new Car(model,components);
    }

    //private static Car createCar(String modelName, List<CarComponent> components){
    //    return new Car(modelName, components);
    //}
}
