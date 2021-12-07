package com.Rafiullah;

import java.util.Locale;

public class Car {
    private String name;
    private String model;
    private int wheels;

    public void setModel(String model){
        String validModel = model.toLowerCase(Locale.ROOT);
        if(validModel.equals("toyota") || validModel.equals("Honda")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }

    }
    public String getModel(){
        return this.model;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setWheels(int wheels){
        this.wheels = wheels;
    }
    public int getWheels(){
        return this.wheels;
    }
}
