package com.linenathalieronning;

//import java.util.HashMap;

/**
 * WEIGHT
 * Subklasse av Meter
 *
 *  Om en vekt opplysning om minste og
 *  største vekt som vekten kan måle (i gram, desimaltall).
 *
 * @author (Line Nathalie Rønning)
 * @version (3.2)
 */

public class Weight extends Meter {
    //Minstevekt og maksimumvekt i gram
    private double minWeight, maxWeight;

    // Konstuktør
    public Weight(Meter meter, double minWeight, double maxWeight) {
        super(meter.getRegLetter(), meter.getRegNr(), meter.getRoomNumber(), meter.getShelfLoc(), meter.isInstrumentStatus());
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    // Parametrisk konstruktør
    public Weight(String regLetter, int regNr, int roomNumber, int shelfLoc, boolean instrumentStatus, double minWeight, double maxWeight) {
        super(regLetter, regNr, roomNumber, shelfLoc, instrumentStatus);

        setMinWeight(minWeight);
        setMaxWeight(maxWeight);
    }

    public double getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(double minWeight) {
        this.minWeight = minWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }


    @Override
    public String toString() {
        //return super.toString();
        return "\n" +
                "Vekt" +
                "\n(minimumsvekt er " + getMinWeight() + "kg og maksvekt er " + getMaxWeight() + "kg)" +
                "\n" + super.toString()+
                "\n";

    }
}
