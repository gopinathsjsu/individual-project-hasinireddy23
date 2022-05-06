package com.individual_project_hasinireddy23.Validators;

public class AmexValidator extends CardValidator {
    public AmexValidator(CardValidator cardValidator) {
        super(cardValidator);
    }
    public void validate(String cardNum){

        String sec= String.valueOf(cardNum.charAt(1));

        if(cardNum.length()==15 & cardNum.startsWith("3") & (sec.equals("3") || sec.equals("4"))){
            System.out.println("validate Amex");
        }
        else{
            super.validate(cardNum);
        }

    }
}
