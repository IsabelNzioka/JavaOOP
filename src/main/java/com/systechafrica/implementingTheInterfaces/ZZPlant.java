package com.systechafrica.implementingTheInterfaces;

import com.systechafrica.encapsulation.Plant;
import com.systechafrica.interfaces.TropicalIndoorI;

public class ZZPlant extends Plant  implements TropicalIndoorI {
    // indoor plant that doesn't need lighting instructions
    // ZZ plant is also Toxic to pets

    public ZZPlant(String plantCode, int price, String description) {
        super(plantCode, price, description);
    }

    @Override
    public void humidityControl() {
        System.out.println("Maintain moderate humidity levels for the ZZ Plant.");
    }

    @Override
    public void temperatureRegulation() {
        System.out.println("Keep the ZZ Plant in a temperature range of 65-75°F (18-24°C).");
    }

    @Override
    public void pottingMixDetails() {
        System.out.println("Use well-draining soil mix for potting the ZZ Plant.");
    }
}
