package com.linenathalieronning;
//import java.util.HashMap;

/**
 * CLOCK
 * Subklasse av Meter
 *
 * Om en klokke opplysning om minste tidsintervall klokken kan måle (i sekunder, desimaltall).
 *
 * @author (Line Nathalie Rønning)
 * @version (3.2)
 */

public class Clock extends Meter {

    //Tid er målt i sekunder og tideler ved bruk av datatypen double
    private double minTime, maxTime;

    // Konstuktør
    public Clock(Meter meter, double minTime, double maxTime) {
        super(meter.getRegLetter(), meter.getRegNr(), meter.getRoomNumber(), meter.getShelfLoc(), meter.isInstrumentStatus());
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    // Parametrisk konstruktør
    public Clock(String regLetter, int regNr, int roomNumber, int shelfLoc, boolean instrumentStatus, double minTime, double maxTime) {
        super(regLetter, regNr, roomNumber, shelfLoc, instrumentStatus);

        setMinTime(minTime);
        setMaxTime(maxTime);
    }

    public double getMinTime() {
        return minTime;
    }

    public void setMinTime(double minTime) {
        this.minTime = minTime;
    }

    public double getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(double maxTime) {
        this.maxTime = maxTime;
    }


    @Override
    public String toString() {
        //return super.toString();
        return "\n" +
                "Klokke" +
                "\n(minimums tidsintervall er " + getMinTime() + "s og maks tidsintervall er " + getMaxTime() + "s)" +
                "\n" + super.toString() +
                "\n";

    }
}
