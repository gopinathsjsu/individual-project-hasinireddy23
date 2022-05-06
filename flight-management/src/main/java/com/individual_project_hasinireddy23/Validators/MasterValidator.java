package com.individual_project_hasinireddy23.Validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MasterValidator extends CardValidator{
    public MasterValidator(CardValidator cardValidator) {
        super(cardValidator);
    }
    public void validate(String cardNum){
        String regexStr = "[1-5]+";
        String sec= String.valueOf(cardNum.charAt(1));
        Pattern pattern=Pattern.compile(regexStr);
        Matcher matcher=pattern.matcher(sec);
        boolean res=matcher.matches();
        System.out.println("res"+res);
        if(cardNum.startsWith("5") && cardNum.length()==16 && res ){
            System.out.println("validate master");
            //return true;
        }
        else{
            super.validate(cardNum);
            //return false;
        }

    }
}
