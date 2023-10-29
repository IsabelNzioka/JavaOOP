package com.systechafrica;

import java.util.ArrayList;
import java.util.List;

import com.systechafrica.encapsulation.Plant;
import com.systechafrica.implementingTheInterfaces.AnubiasPlant;
import com.systechafrica.implementingTheInterfaces.DwarfBabyTears;
import com.systechafrica.implementingTheInterfaces.ParlorPalm;
import com.systechafrica.implementingTheInterfaces.RosemaryPlant;
import com.systechafrica.implementingTheInterfaces.TillandsiaIonantha;
import com.systechafrica.implementingTheInterfaces.ZZPlant;
import com.systechafrica.interfaces.AirPlantI;
import com.systechafrica.interfaces.PetFriendlyI;
import com.systechafrica.interfaces.TropicalIndoorI;

public class App 
{


    
    public static void main( String[] args )
    {

    TillandsiaIonantha tillandsiaIonantha = new TillandsiaIonantha("0001", 200, "TillandsiaIonantha");
    DwarfBabyTears dwarfBabyTears = new DwarfBabyTears("2001", 800, "DwarfBabyTears");
    ParlorPalm parlorPalm = new ParlorPalm("23001", 2000, "ParlorPalm");
    RosemaryPlant rosemaryPlant = new RosemaryPlant("234001", 200, "RosemaryPlant");
    AnubiasPlant anubiasPlant = new AnubiasPlant("0VU001", 200, "AnubiasPlant");
    ZZPlant zzPlant = new ZZPlant("00rT01", 200, "ZZPlant");

    // Runtime Polymorphism.
    System.out.println("PLant Information");
    tillandsiaIonantha.getPlantInformation();
    dwarfBabyTears.getPlantInformation();
    parlorPalm.getPlantInformation();
    rosemaryPlant.getPlantInformation();
    anubiasPlant.getPlantInformation();
    zzPlant.getPlantInformation();

    System.out.println();


    // Liskov Substitution Principle.

 
    List<TropicalIndoorI> indoorPlants = new ArrayList<>();
    indoorPlants.add(parlorPalm);
    indoorPlants.add(zzPlant);

      for(TropicalIndoorI plant : indoorPlants) {
       plant.humidityControl();
       System.out.println();
    }


    List<PetFriendlyI> petFriendlyPlants = new ArrayList<>();
    petFriendlyPlants.add(new AnubiasPlant("200", 200, "Pet friendly Anubias"));
    petFriendlyPlants.add(new RosemaryPlant("200", 200, "Pet friendly Rosemary"));
    petFriendlyPlants.add(new ParlorPalm("200", 200, "Pet friendly ParlorPalm"));
    petFriendlyPlants.add(new TillandsiaIonantha("200", 200, "Pet friendly Tillandsia Ionantha"));
    

     for(PetFriendlyI plant : petFriendlyPlants) {
       plant.petFriendly();
    }
    }

   
}
