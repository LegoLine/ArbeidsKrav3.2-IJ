package com.linenathalieronning;

//import java.util.HashMap;

/**
 * THERMOMETER
 * Subklasse av Meter
 *
 * Om et termometer skal det i tillegg være opplysning om laveste og høyeste temperatur
 * som termometeret kan måle (i °C, desimaltall)
 *
 * @author (Line Nathalie Rønning)
 * @version (3.2)
 */

public class Thermometer extends Meter {
    //Temperatur målt i celsius
    private double minTemp, maxTemp;

    // Konstuktør
    public Thermometer(Meter meter, double minTemp, double maxTemp) {
        super(meter.getRegLetter(), meter.getRegNr(), meter.getRoomNumber(), meter.getShelfLoc(), meter.isInstrumentStatus());
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

    // Parametrisk konstruktør
    public Thermometer(String regLetter, int regNr, int roomNumber, int shelfLoc, boolean instrumentStatus, double minTemp, double maxTemp) {
        super(regLetter, regNr, roomNumber, shelfLoc, instrumentStatus);

        setMinTemp(minTemp);
        setMaxTemp(maxTemp);
    }


    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }



    @Override
    public String toString() {
        //return super.toString();
        return "\n" +
                "Termometer" +
                "\n(mintemp er " + getMinTemp() + "̊ C og makstemp er " + getMaxTemp() + "̊ C)" +
                "\n" + super.toString() +
                "\n";

    }
}