package com.systechafrica.encapsulation;

import com.systechafrica.abstraction.PlantCommonOperations;

public class Plant extends PlantCommonOperations{ 

    // Encapsulation
    // Single Responsibility Principle - This class has a single responsibility of providing the common functionalities of all types of plants.
    
    
    private String name;
    private int price;
    private String description;
    private Category Category;
    
    public Plant() {
    }
    public Plant(String name, int price, String description, com.systechafrica.encapsulation.Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        Category = category;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public Category getCategory() {
        return Category;
    }
    public void setCategory(Category category) {
        Category = category;
    }
    @Override
    public void getPlantInformation() {
        System.out.println("Plant Information: Name - " + getName() + ", Price - " + getPrice() + ", Description - " + getDescription());
    }

   

}