package agh.to.main;

public class Engine extends CarComponent {
    private float displacement;
    private String fuel;

    public Engine(float displacement, String fuel, int additionalFee) {
        super(additionalFee);
        this.displacement = displacement;
        this.fuel = fuel;
    }
}
