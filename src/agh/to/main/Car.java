package agh.to.main;

import java.util.List;

public class Car {
    private String modelName;
    private List<CarComponent> carComponents;

    public int getPrice(){
        int sum = 0;
        for (CarComponent component: carComponents) {
            sum += component.getAdditionalFee();
        }
        return sum;
    }

    public void description(){
        System.out.println("Car: " + modelName);
        for(CarComponent carComponent: carComponents){
            System.out.println(carComponent.getDescription());
        }
        System.out.print("Costs: ");
        System.out.print(getPrice());
    }

    protected Car(String modelName, List<CarComponent> components){
        this.modelName = modelName;
        this.carComponents = components;
    }


}
