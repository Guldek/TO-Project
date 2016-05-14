package agh.to.carfactory;

public abstract class CarComponent {
    protected int additionalFee;
    public int getAdditionalFee() {
        return additionalFee;
    }

    public abstract String getDescription();

    public CarComponent(int additionalFee){
        this.additionalFee = additionalFee;
    }
}
