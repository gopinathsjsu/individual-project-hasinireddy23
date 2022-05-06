package com.individual_project_hasinireddy23.Validators;


import java.io.IOException;
import java.util.ArrayList;

import com.individual_project_hasinireddy23.BookingDetails;
import com.individual_project_hasinireddy23.Flights;
import com.individual_project_hasinireddy23.ListOfFlights;
import com.individual_project_hasinireddy23.Output.OutputFactoryEx;

public class FlightNoValidator {
    public FlightNoValidator() {
    }


    public boolean validateSeats(BookingDetails b,Flights f){
        if(b.getNoOfSeats()<=f.getNoOfSeats()){
            return true;
        }
        else{
            return false;
        }

    }
    public boolean validatecategory(BookingDetails b,ArrayList<Flights> filteredFlights){
        boolean[] flag={false};

        filteredFlights.forEach(ele->{
            if(ele.getCategory().equals(b.getCategory())){
             flag[0] = validateSeats(b,ele);

            }
        });
        return flag[0];
    }
    public boolean validateFlight(BookingDetails b) throws IOException {

        ArrayList<Flights> fl=ListOfFlights.getInstance().getList();
        ArrayList<Flights> filteredFlights=new ArrayList<>();
        boolean[] flag={false};
     fl.forEach(ele->{
         if(ele.getFlightNum().equals(b.getFlightNum())){
             filteredFlights.add(ele);
             flag[0]=true;
         }
     });
     if(!flag[0]){
         OutputFactoryEx outputFactoryEx=new OutputFactoryEx(null,b.getName(),"Invalid flight number");
         OutputFactoryEx.createType();

         System.out.println("No flight number");
     }
     else{
         flag[0]=validatecategory( b,filteredFlights);

     }
     return flag[0];
    }
}
