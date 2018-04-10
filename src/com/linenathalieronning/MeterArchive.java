package com.linenathalieronning;
//import java.util.List;
import java.util.ArrayList;
//import java.util.Objects;
import java.util.Scanner;

/**
 * METERARCHIVE
 *
 * CONTROLLEREN til Meter - denne klassen er ansvarlig for opprettelsen av nye objekter.
 *
 * @Author(Line Nathalie Rønning)
 * @Version (3.2)
 */

public class MeterArchive{
    /* ArrayList til å ha måleinstrumentene våre i */
    private ArrayList<Meter> meterTools;
    /* Scanner så brukeren selv kan legge inn input senere*/
    private Scanner scanner;

    /* Konstruktør uten parametre*/
    public MeterArchive(){
        meterTools = new ArrayList();
        scanner = new Scanner(System.in);
    }


    /* Oppretter nye "standard" måleinstrumenter, henholdsvis klokke, termometer og vekt og legger dem inn i meterTools*/
    public boolean createStandardClock(){
        Clock c = new Clock("K", 1, 1, 1, true, 0.00, 60.00);
        meterTools.add(c);
        //System.out.println(c);
        return true;
    }

    public boolean createStandardThermometer(){
        Thermometer t = new Thermometer("T", 1, 1, 1, true, 0.00, 200.00);
        meterTools.add(t);
        //System.out.println(t);
        return true;
    }

    public boolean createStandardWeight(){
        Weight w = new Weight("V", 1, 1, 1, true, 0.01, 1000.00);
        meterTools.add(w);
        //System.out.println(w);
        return true;
    }



    /* Metode for å opprette nytt måleinstrument(Meter) ved hjelp av brukerinput(fungerer så lenge
    brukeren følger de gitte instruksjonene) */
    public boolean meterCreator(){

        System.out.println("Vennligst skriv inn hvilken type måleinstrument du vil opprette(klokke, termometer eller vekt): ");
        String instrumentType = scanner.nextLine().toLowerCase();

        System.out.println("Vennligst skriv inn registreringsnummer(bare heltall): ");
        int regNr = scanner.nextInt();

        System.out.println("Vennligst skriv inn romnummer: ");
        int roomNr = scanner.nextInt();

        System.out.println("Vennligst skriv inn hylleplassering: ");
        int shelf = scanner.nextInt();

        System.out.println("Vennligst skriv inn status på instrumentet(true/false): ");
        boolean instrStatus = scanner.nextBoolean();
        /*if(instrStatus == false){
            System.out.println("ikke i orden");
        }
        if (instrStatus == true){
            System.out.println("I orden");
        }*/


        Meter meter = new Meter("", regNr, roomNr, shelf, instrStatus);

        if (instrumentType.equals("klokke")){
            meter.setRegLetter("K");
            createClock(meter);
        }
        if (instrumentType.equals("termometer")){
            meter.setRegLetter("T");
            createThermometer(meter);
        }
        else if (instrumentType.equals("vekt")){
            meter.setRegLetter("V");
            createWeight(meter);
        }
        meter.setRegLetter("I");

        System.out.println(meter.toString());

        /* Forteller brukeren om den har greid å oprette et nytt Meter-objekt */
        return true;

    }


    /* Metode som skal opprette et nytt objekt av typen Clock og legger det nye objektet inn i
    ArrayListen vår(meterTools) */
    public boolean createClock(Meter meter){
        System.out.println("Vennligst skriv inn minste tidsintervall i sekunder og tideler(eks 0,00(pass på å bruke komma og ikke punktum)): ");
        double minTime = scanner.nextDouble();
        System.out.println("Vennligst skriv inn maks tidsintervall i sekunder og tideler(eks 0,00(pass på å bruke komma og ikke punktum)): ");
        double maxTime = scanner.nextDouble();
        Clock clock = new Clock(meter, minTime, maxTime);
        meterTools.add(clock);
        return true;
    }


    /* Metode som skal opprette et nytt objekt av typen Thermometer og legger det nye objektet inn i
    ArrayListen vår(meterTools) */
    public boolean createThermometer(Meter meter){
        System.out.println("Vennligst skriv inn minste temperatur(eks 0,00(pass på å bruke komma og ikke punktum)) i ̊ C: ");
        double minTemp = scanner.nextDouble();
        System.out.println("Vennligst skriv inn maks temperatur(eks 200,00(pass på å bruke komma og ikke punktum)) i ̊ C: ");
        double maxTemp = scanner.nextDouble();
        Thermometer thermometer = new Thermometer(meter, minTemp, maxTemp);
        meterTools.add(thermometer);
        return true;
    }


    /* Metode som skal opprette et nytt objekt av typen Weight og legger det nye objektet inn i
    ArrayListen vår(meterTools) */
    public boolean createWeight(Meter meter){
        System.out.println("Vennligst skriv inn minimumsvekt(eks 0,00(pass på å bruke komma og ikke punktum)) i kg: ");
        double minWeight = scanner.nextDouble();
        System.out.println("Vennligst skriv inn maksvekt(eks 150,54(pass på å bruke komma og ikke punktum)) i kg: ");
        double maxWeight = scanner.nextDouble();
        Weight weight = new Weight(meter, minWeight, maxWeight);
        meterTools.add(weight);
        return true;
    }

    /* toString metode som gir oss alle objektene i ArrayListen(meterTools) vår */
    @Override
    public String toString() {
        return "\n" +
                "MÅLEINSTRUMENTENE I LISTEN VÅR: " +
               "\n" + meterTools +
                "\nTHAT'S ALL(fra listen) FOLKS!";
    }

    /* Returnerer antall måleinstrumenter vi har i ArrayListen vår */
    public void getMeterToolsSize(){
        System.out.println("\nAntall måleinstrumenter i listen er: [" + meterTools.size() + "]");
    }

    //ToDo: Hente, endre, slette

    /* Metode som gjør det lett for brukeren å hente ut ArrayListen og bruke den senere når den initialiseres i Client */
    public ArrayList<Meter> getMeterTools() {
        return meterTools;
    }

    /* Henter ut et spesifikt objekt fra listen vår ved bruk av registeringsnummeret til objektet som parameter som
    * bruker selv legger inn via en skanner */
    public Meter retrieveMeterTool(){
        /*for (Meter m : meterTools){
            if (regNr == m.getRegNr()){
               m.toString();
                return m;
            }
        }*/
        System.out.println("Vennligst oppgi instrumentets regNr(kun int): ");
        int userInput = scanner.nextInt();
        for (Meter m : meterTools){
            if (userInput == m.getRegNr()){
                System.out.println("Vi fant, vi fant!!");
                System.out.println("\n-------------------------------------------------");
                System.out.println(m);
                System.out.println("\n-------------------------------------------------");
                return m;
            }
        }
        System.out.println("Finner dessverre ikke ønsket objekt, men prøv gjerne igjen.");
        return null;
    }


    /* Sletter ALLE instrumentene i ArrayListen vår */
    public boolean deleteAllMeterTools(){
        meterTools.clear();
        System.out.println("\n|-------------------------------------|");
        System.out.println("|Sletter alle elementer fra meterTools|");
        System.out.println("|-------------------------------------|");
        return true;
    }


    /* Sletter et spesifikt instrument fra ArrayListen vår. OBS! Bruker må selv skrive inn input */
    public boolean deleteMeterTool() {
        System.out.println("Vennligst oppgi regNr(kun int) til instrumentet du ønsker å slette: ");
        int userInput = scanner.nextInt();
        for (Meter m : meterTools) {
            if (userInput == m.getRegNr()) {
                System.out.println("");
                System.out.println("Følgende instrument er slettet");
                System.out.println("og vil ikke lenger finnes i meterTools-listen: ");
                System.out.println("\n-------------------------------------------------");
                System.out.println("\n" + m);
                System.out.println("-------------------------------------------------\n");
                meterTools.remove(m);
                return true;
            }
        }
        return false;

    }


    /* Endrer instrumentStatus på et spesifikt instrument i ArrayListen vår */
    public boolean changeStatus(){
        System.out.println("Vennligst oppgi regNr(kun int) til instrumentet du ønsker å endre status på: ");
        int userInput = scanner.nextInt();
        for (Meter m : meterTools) {
            if (userInput == m.getRegNr()) {
                System.out.println("Vennligst oppgi ny status: ");
                boolean newStatus = scanner.nextBoolean();
                m.setInstrumentStatus(newStatus);
                System.out.println("");
                System.out.println("Følgende instrument er endret: ");
                System.out.println("\n-------------------------------------------------");
                System.out.println("\n" + m);
                System.out.println("-------------------------------------------------\n");
                return true;
            }
        }
        return false;
    }

    /* Endrer instrumentStatus på et spesifikt instrument i ArrayListen vår */

    public boolean changeLocation(){
        System.out.println("Vennligst oppgi regNr(kun int) til instrumentet du ønsker å endre plassering på: ");
        int userInput = scanner.nextInt();
        for (Meter m : meterTools) {
            if (userInput == m.getRegNr()) {

                System.out.println("Vennligst oppgi nytt rom: ");
                int newRoom = scanner.nextInt();
                m.setRoomNumber(newRoom);

                System.out.println("Vennligst oppgi ny hylleplassering: ");
                int newShelf = scanner.nextInt();
                m.setShelfLoc(newShelf);

                System.out.println("");
                System.out.println("Følgende instrument er endret: ");
                System.out.println("\n-------------------------------------------------");
                System.out.println("\n" + m);
                System.out.println("-------------------------------------------------\n");
                return true;
            }
        }
        return false;
    }





}