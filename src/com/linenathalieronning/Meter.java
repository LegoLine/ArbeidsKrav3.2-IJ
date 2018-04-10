package com.linenathalieronning;

/**
 * METER - Måleinstrument
 *
 * SUPERKLASSEN til klassene Thermometer, Clock og Weight
 *
 * Author(Line Nathalie Rønning)
 * Version (3.2)
 */

// ToDo: Gå ordentlig gjennom instrumentStatus og equals-metoden

public class Meter {
    // Felles egenskaper for alle tre klassene:
    // Entydig regnr(eks K1234)
    // Er instrumentet i orden eller ikke - Status
    // Hvor befinner instumentet seg? Rom + hylleplass(R24H3 - rom 24, hylle 3)

    String regLetter;
    int regNr, roomNumber, shelfLoc;
    boolean instrumentStatus; //true - instrumentet er i god stand

    /*
    //konstuktør uten parametre
    public Meter(){
        this.regLetter = regLetter;
        this.regNr = regNr;
        this.roomNumber = roomNumber;
        this.shelfLoc = shelfLoc;
        this.instrumentStatus = true;
    }
    */

    /* En "copy-konstruktør" for at brukeren lettere skal kunne opprette et nytt måleinstrument */
    public Meter(Meter meter){
        this(meter.regLetter, meter.regNr, meter.roomNumber, meter.shelfLoc, meter.isInstrumentStatus());
    }

    // parametrisk konstuktør
    public Meter(String regLetter, int regNr, int roomNumber, int shelfLoc, boolean instrumentStatus){
        setRegLetter(regLetter);
        setRegNr(regNr);
        setRoomNumber(roomNumber);
        setShelfLoc(shelfLoc);
        setInstrumentStatus(instrumentStatus);
    }

    public String getRegLetter() {
        return regLetter;
    }

    protected void setRegLetter(String regLetter) {
        this.regLetter = regLetter;
    }

    public int getRegNr() {
        return regNr;
    }

    protected void setRegNr(int regNr) {
        this.regNr = regNr;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    protected void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getShelfLoc() {
        return shelfLoc;
    }

    protected void setShelfLoc(int shelfLoc) {
        this.shelfLoc = shelfLoc;
    }

    public boolean isInstrumentStatus() {
        return instrumentStatus;
    }

    protected void setInstrumentStatus(boolean instrumentStatus) {
        this.instrumentStatus = instrumentStatus;
    }


    /* toString-metode */
    @Override
    public String toString() {
        //return super.toString();
        return "Regnummer: " + getRegLetter() + getRegNr() +
                "\nPlassering: " + "R" + getRoomNumber() + "H" + getShelfLoc() +
                "\nStatus:  " + (instrumentStatus ? "I orden" : "I ustand") +
                "\n";
    }

    /* equals-metode */
    public boolean meterEquals(Object o){
        Meter meter = (Meter) o;

        if(regNr != meter.regNr) return false;
        if(roomNumber != meter.roomNumber) return false;
        if(shelfLoc != meter.shelfLoc) return false;
        if(instrumentStatus != meter.instrumentStatus) return false;
        return false;

    }

}
