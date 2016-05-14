package agh.to.main;

public class CarComponent {
    protected int additionalFee;
    public int getAdditionalFee() {
        return additionalFee;
    }

    public String getDescription(){
        return "";
    }

    public CarComponent(int additionalFee){
        this.additionalFee = additionalFee;
    }
}
