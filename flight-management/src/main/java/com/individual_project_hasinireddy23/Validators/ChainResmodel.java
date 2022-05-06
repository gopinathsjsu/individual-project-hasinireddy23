package com.individual_project_hasinireddy23.Validators;

import com.individual_project_hasinireddy23.BookingDetails;

public class ChainResmodel {
    CardValidator chain;
    FlightValidator chain1;
    public ChainResmodel(){
        buildChain();

    }
    public void buildChain(){
        chain=new MasterValidator(new VisaValidator(new AmexValidator(new DiscoveryValidator(null))));
    //chain1=new FlightNumValidator(new FlightSeatValidator(null));
    }
    public void validate(String cardNum){
        System.out.println("chain-->"+chain);
        chain.validate(cardNum);
        //return flag;
    }
    public String getRes(){
      return chain.getRes();


    }
    public void validateFlight(BookingDetails b){
        chain1.validateFlight(b);
    }
}
