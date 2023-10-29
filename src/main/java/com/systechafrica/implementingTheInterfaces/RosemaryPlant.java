package com.systechafrica.implementingTheInterfaces;

import com.systechafrica.encapsulation.Plant;
import com.systechafrica.interfaces.OutdoorI;
import com.systechafrica.interfaces.PetFriendlyI;
import com.systechafrica.interfaces.SunlightRequirements;

public class RosemaryPlant extends Plant implements OutdoorI, SunlightRequirements, PetFriendlyI{

    public RosemaryPlant(String plantCode, int price, String description) {
        super(plantCode, price, description);
    }

    @Override
    public void soilPreparation() {
        System.out.println("Prepare well-drained and nutrient-rich soil for planting the Rosemary plant.");
    }

    @Override
    public void pestControlStrategies() {
        System.out.println("Implement natural pest control methods such as companion planting to protect the Rosemary plant.");
    }

    @Override
    public void sunlightRequirements() {
        System.out.println("Place the Rosemary plant in a location with full sunlight exposure for at least 6-8 hours a day.");
    }

    @Override
    public void petFriendly() {
        System.out.println("Rosemary is generally considered to be non-toxic to pets.");

     
    }
}
