package com.systechafrica.implementingTheInterfaces;

import com.systechafrica.encapsulation.Plant;
import com.systechafrica.interfaces.LightingInstructionsI;
import com.systechafrica.interfaces.PetFriendlyI;
import com.systechafrica.interfaces.TropicalIndoorI;

public class ParlorPalm extends Plant  implements TropicalIndoorI, PetFriendlyI, LightingInstructionsI {
    // Pet-friendly indoor plant
    // requires a lot of light

    public ParlorPalm(String plantCode, int price, String description) {
        super(plantCode, price, description);
    }

    @Override
    public void humidityControl() {
        System.out.println("Maintain moderate to high humidity levels for the Parlor Palm.");
    }

    @Override
    public void temperatureRegulation() {
        System.out.println("Keep the Parlor Palm in a temperature range of 65-80°F (18-27°C).");
    }

    @Override
    public void pottingMixDetails() {
        System.out.println("Use well-draining soil mix with good aeration for potting the Parlor Palm.");
    }

    @Override
    public void lightingInstructions() {
        System.out.println("Place the Parlor Palm in a well-lit area with bright, indirect sunlight.");
    }

    @Override
    public void petFriendly() {
        System.out.println("The Parlor Palm is safe for pets and does not pose a threat if ingested.");
    }
}
