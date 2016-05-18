package agh.to.carfactory;

public abstract class CarComponent {
    private double additionalFee;
    public double getAdditionalFee() {
        return additionalFee;
    }

    public abstract String getDescription();

    public CarComponent(double additionalFee){
        this.additionalFee = additionalFee;
    }
}
