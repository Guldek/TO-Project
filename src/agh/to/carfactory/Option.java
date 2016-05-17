package agh.to.carfactory;

public class Option extends CarComponent{
    private String optionName;

    public Option(String optionName, double additionalFee) {
        super(additionalFee);
        this.optionName = optionName;
    }

    @Override
    public String getDescription(){
        return optionName;
    }
}
