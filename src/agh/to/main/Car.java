package agh.to.main;

import java.util.List;

public class Car {
    private String modelName;
    private List<CarComponent> carComponents;

    public int GetPrice(){
        int sum = 0;
        for (CarComponent component: carComponents) {
            sum += component.getAdditionalFee();
        }
        return 0;
    }

    protected Car(){}

    protected Car(String modelName, List<CarComponent> components){
        this.modelName = modelName;
        this.carComponents = components;
    }
}
