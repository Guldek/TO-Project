package agh.to.main;

public class Option extends CarComponent{
    private String optionName;

    public Option(String optionName, int additionalFee) {
        super(additionalFee);
        this.optionName = optionName;
    }

    @Override
    public String getDescription(){
        return optionName;
    }
}
