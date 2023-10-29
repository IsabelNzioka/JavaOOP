package com.systechafrica.implementingTheInterfaces;

import com.systechafrica.encapsulation.Plant;
import com.systechafrica.interfaces.AirPlantI;
import com.systechafrica.interfaces.LightingInstructionsI;
import com.systechafrica.interfaces.PetFriendlyI;

public class TillandsiaIonantha extends Plant  implements AirPlantI, PetFriendlyI, LightingInstructionsI{

    public TillandsiaIonantha (String plantCode, int price, String description) {
        super(plantCode, price, description);
    }

    @Override
    public void airCirculationRequirements() {
        System.out.println("Maintain proper air circulation for Tillandsia Ionantha.");
    }

    @Override
    public void mountingDetails() {
        System.out.println("Mount Tillandsia Ionantha on a suitable surface such as driftwood or rocks.");
    }

    @Override
    public void lightingInstructions() {
        System.out.println("Tillandsia Ionantha is generally not affected by regular indoor lighting conditions.");
    }

    @Override
    public void petFriendly() {
        System.out.println("Tillandsia Ionantha is non-toxic to pets and safe to have in households with animals.");
    }
}


