package agh.to.carfactory;

public class Engine extends CarComponent {
    private float displacement;
    private String fuel;

    public Engine(float displacement, String fuel, double additionalFee) {
        super(additionalFee);
        this.displacement = displacement;
        this.fuel = fuel;
    }

    @Override
    public String getDescription(){
        return "displacement: " + String.valueOf(displacement) + "\n" + "fuel: " + fuel;
    }
}
