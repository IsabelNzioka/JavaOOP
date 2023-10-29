package com.systechafrica.implementingTheInterfaces;

import com.systechafrica.encapsulation.Plant;
import com.systechafrica.interfaces.AquaticPlantI;
import com.systechafrica.interfaces.LightingInstructionsI;

public class DwarfBabyTears extends Plant implements AquaticPlantI, LightingInstructionsI{
    // Requires abundant lightning
    // Not Pet friendly


    public DwarfBabyTears (String plantCode, int price, String description) {
        super(plantCode, price, description);
    }

    @Override
    public void aquariumCompatibility() {
        System.out.println("Ensure that the Dwarf Baby Tears is compatible with other aquatic species in the aquarium.");
    }

    @Override
    public void waterFiltrationAssistance() {
        System.out.println("Dwarf Baby Tears can aid in maintaining water quality by facilitating natural filtration.");
    }

    @Override
    public void waterDetails() {
        System.out.println("Maintain stable water parameters, including temperature and pH, for the healthy growth of Dwarf Baby Tears.");
    }

    @Override
    public void lightingInstructions() {
        System.out.println("Place the Dwarf Baby Tears in an aquarium with abundant lighting to promote healthy growth.");
    }

   
}








