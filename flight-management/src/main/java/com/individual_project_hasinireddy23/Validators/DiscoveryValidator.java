package com.individual_project_hasinireddy23.Validators;

public class DiscoveryValidator extends CardValidator{
    public DiscoveryValidator(CardValidator cardValidator){
        super(cardValidator);
    }
    public void validate(String cardNum){
        if(cardNum.length()==16 & cardNum.startsWith("6011")){
            System.out.println("validate Discovery");
            //return true;
        }
        else{
            super.validate(cardNum);
            //return false;
        }

    }
}
