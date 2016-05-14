package agh.to.main;

import java.util.LinkedList;
import java.util.List;

public class CarFactory {
    public final static List<Engine> availableEngines = new LinkedList<Engine>();
    public final static List<Option> availableOptions = new LinkedList<Option>();
    public final static List<String> availableModels = new LinkedList<String>();
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
    public static Car createCar(String modelName, List<CarComponent> components){
        return new Car(modelName, components);
    }
}
