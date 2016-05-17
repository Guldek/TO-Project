package agh.to.carfactory;

public class Model {
    protected String modelName;
    protected double additionalFee;
    public double getAdditionalFee() {
        return additionalFee;
    }

    public Model(String modelName, double additionalFee){
        this.modelName = modelName;
        this.additionalFee = additionalFee;
    }

}
