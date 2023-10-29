package com.systechafrica.implementingTheInterfaces;

import com.systechafrica.encapsulation.Plant;
import com.systechafrica.interfaces.AquaticPlantI;
import com.systechafrica.interfaces.PetFriendlyI;

public class AnubiasPlant extends Plant  implements AquaticPlantI, PetFriendlyI{
    // Does not need lighting instructions.
    // pet friendly if your have a pet fish

    // This class is only focused on the unique behavior and characteries of the Anubias plant.

    public AnubiasPlant(String plantCode, int price, String description) {
        super(plantCode, price, description);
    } 

    @Override
    public void aquariumCompatibility() {
        System.out.println("Ensure that the Anubias plant is compatible with the other aquatic species in the aquarium.");
    }

    @Override
    public void waterFiltrationAssistance() {
        System.out.println("Anubias plants can help in maintaining water quality by aiding in natural filtration.");
    }

    @Override
    public void waterDetails() {
        System.out.println("Maintain stable water parameters, including temperature and pH, for the healthy growth of Anubias plants.");
    }

    @Override
    public void petFriendly() {
        System.out.println("Anubias plants are considered pet-friendly when kept in aquariums with pet fish.");
 
       
    }

}
