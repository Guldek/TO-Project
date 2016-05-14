package agh.to.main;

import java.util.List;

public class CarFactory {
    private List<Engine> avalaibleEngines;
    private List<Option> avalaibleOptions;
    private List<String> avalibleModels;

    public Car createCar(String modelName, List<CarComponent> components){
        return new Car(modelName, components);
    }
}
