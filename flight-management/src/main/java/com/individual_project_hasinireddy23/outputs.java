package com.individual_project_hasinireddy23;
import java.util.ArrayList;

public class Outputs {
    private String name;
    private String flightNum;
    private int noOfSeats;
    private String category;
    private Integer cost;
    private static ArrayList<Outputs> outputs=new ArrayList<>();

    public Outputs(String name, String flightNo, String category, int seats, Integer cost) {
        this.name = name;
        this.flightNum = flightNo;
        this.noOfSeats = seats;
        this.category = category;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public String getCategory() {
        return category;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public Integer getCost() {
        return cost;
    }
    public void addList(Outputs o){
        outputs.add(o);

    }
    public static ArrayList<Outputs> getList(){
        return outputs;
    }
}
