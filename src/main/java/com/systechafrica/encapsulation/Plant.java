package com.systechafrica.encapsulation;

import com.systechafrica.abstraction.PlantCommonOperations;

public class Plant extends PlantCommonOperations{ 

    // Encapsulation
    // Single Responsibility Principle - This class has a single responsibility of providing the common details of all types of plants.
      
    private String plantCode;
    private int price;
    private String description;

    
    public Plant() {
    }
    public Plant(String plantCode, int price, String description) {
        this.plantCode = plantCode;
        this.price = price;
        this.description = description;
     
    }

    public String getplantCode() {
        return plantCode;
    }
    public void setplantCode(String plantCode) {
        this.plantCode = plantCode;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
 
    @Override
    public void getPlantInformation() {
        System.out.println("Plant Information: plantCode - " + getplantCode() + ", Price - " + getPrice() + ", Description - " + getDescription());
    }

   

}
