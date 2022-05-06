package com.individual_project_hasinireddy23.Validators;

import com.individual_project_hasinireddy23.BookingDetails;

public class FlightValidator {
    private FlightValidator flightValidator;
    public FlightValidator(FlightValidator flightValidator){
        this.flightValidator=flightValidator;
    }

    public void validateFlight(BookingDetails b){
        if(flightValidator!=null){
            flightValidator.validateFlight(b);

        }
        else{
            System.out.println("invalid flight");
        }
        //return true;

    }
}
