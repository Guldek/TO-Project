package agh.to.carfactory;

import java.util.List;

public class Car {
    private Model model;
    private List<CarComponent> carComponents;

    private double getPrice(){
        double sum = 0;
        for (CarComponent component: carComponents) {
            sum += component.getAdditionalFee();
        }
        sum += model.additionalFee;
        return sum;
    }

    public void description(){
        System.out.println("Car: " + model.modelName);
        for(CarComponent carComponent: carComponents){
            System.out.println(carComponent.getDescription());
        }
        System.out.print("Costs: ");
        System.out.print(getPrice()+"\n\n");
    }

    protected Car(Model model, List<CarComponent> components){
        this.model = model;
        this.carComponents = components;
    }


}
