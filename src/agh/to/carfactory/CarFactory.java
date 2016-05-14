package agh.to.carfactory;

import java.util.LinkedList;
import java.util.List;

public class CarFactory {
    private final List<Engine> availableEngines = new LinkedList<>();
    private final List<Option> availableOptions = new LinkedList<>();
    private final List<String> availableModels = new LinkedList<>();
    private Engine engine = null;
    private List<Option> chosenOptions = new LinkedList<>();
    private String model = null;
    public CarFactory() {
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

    public void setEngine(int n) throws Exception{
            engine = availableEngines.get(n);
            System.out.println("Successfully added engine.");
    }
    public void addOption(int n) throws Exception{
        Option choose = availableOptions.get(n);
        if (!chosenOptions.contains(choose)) {
            chosenOptions.add(choose);
            System.out.println("Successfully added option.");
        }else{
            System.out.println("You have already chosen this option.");
        }
    }
    public  void setModel(int n) throws Exception{
            model = availableModels.get(n);
            System.out.println("Successfully chosen model.");
    }

    public Car createCar(){
        List<CarComponent> components = new LinkedList<>();
        components.addAll(chosenOptions);
        components.add(engine);
        return new Car(model,components);
    }
    public void printEngines(){
        for(int i = 0 ; i < availableEngines.size(); i++){
            System.out.println(String.valueOf(i) + ": " + availableEngines.get(i).getDescription());
        }
    }
    public void printModels(){
        for(int i = 0 ; i < availableModels.size(); i++){
            System.out.println(String.valueOf(i) + ": " + availableModels.get(i));
        }
    }
    public void printOptions(){
        for(int i = 0 ; i < availableOptions.size(); i++){
            System.out.println(String.valueOf(i) + ": " + availableOptions.get(i).getDescription());
        }
    }
}
