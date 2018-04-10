package com.linenathalieronning;

//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

/**
 * CLIENT
 *
 * Klient-klassen vår tar i bruk metodene i Contoller-klassen vår(MeterArchive) og setter dem ut i livet
 *
 * For å teste ut en metode - fjern skråstrekene(//) foran metoden og legg dem til igjen når du vil teste en annen for seg selv
 *
 * OBS!:
 * Husk at MeterArchive må være der hele tiden for å kunne kjøre alle metodene, så denne kan ikke kommenteres ut.
 *
 * @Author(Line Nathalie Rønning)
 * @Version (3.2)
 * */
public class Client {

    public static void main(String[] args) {

        /*Oppretter et nytt objekt av MeterArchive*/
        MeterArchive meterArchive = new MeterArchive();


        /*VARIASJONER AV MÅTER Å OPPRETTE NYE METER-OBJEKTER PÅ*/

            /* Oppretter nye standardobjekter av typen Thermometer, Weight og Clock fra
            "createStandard"-metodene i MeterArchive*/
                meterArchive.createStandardClock();
                meterArchive.createStandardThermometer();
                meterArchive.createStandardWeight();


            /* Oppretter nye objekter av typen Thermometer, Weight og Clock og skriver ut til String */
                Thermometer t1 = new Thermometer("T", 2, 2, 2, true, 10.00, 90.00);
                //t1.toString();
                //System.out.println(t1.toString());
                Weight v1 = new Weight("V", 2, 2, 2, false, 2.00, 350.45);
                //w1.toString();
                //System.out.println(w1.toString());
                Clock k1 = new Clock("K", 2, 2, 2, true, 9.00, 25.60);
                //c1.toString();
                //System.out.println(c1.toString());

            /* Legger objektene i ArrayListen vår(meterTools) som ligger i MeterArchive */
                meterArchive.getMeterTools().add(t1);
                meterArchive.getMeterTools().add(v1);
                meterArchive.getMeterTools().add(k1);




            /* Lar brukeren selv opprette et objekt av typen de vil ved hjelp av brukerens egen input */
                meterArchive.meterCreator();


        /* END VARIASJONER AV MÅTER Å OPPRETTE NYE METER-OBJEKTER PÅ */

//--------------------------------------------------------------------------------------------------------------------//


        /* Printer ut innholdet i ArrayListen vår - begge metodene gjør så og si det samme, det er bare tre forskjellige
         * måter å skrive ut på. Test deg gjerne frem og se om du ser noen forskjeller i utskriften :) */
            //System.out.println(meterArchive.getMeterTools());
            //System.out.println(meterArchive.toString());
            System.out.println(meterArchive);

        /* Printer ut antall måleinstrumenter som finnes i listen vår */
            meterArchive.getMeterToolsSize();


        /* Henter ut et spesifikt objekt fra listen vår ved bruk av registeringsnummeret til objektet som parameter
        * her skal bruker selv gi input til programmet via en skanner for å finne ønsket objekt */
            //meterArchive.getMeterTools().get(1).setInstrumentStatus(true);
            meterArchive.retrieveMeterTool();



//--------------------------------------------------------------------------------------------------------------------//
        /* Endrer status på instrumentene våre true/false ettersom hva bruker legger inn som input */
            meterArchive.changeStatus();

        /* Endrer plasseringen til instrumentet vårt fra f.eks. R1H1 til R234H6 */
            meterArchive.changeLocation();

//--------------------------------------------------------------------------------------------------------------------//


        /* Sletter alle måleinstrumenter fra listen vår - i tillegg kan vi kjøre en getMeterToolsSize() for
         * å sjekke at listen nå er tom */
            //meterArchive.deleteAllMeterTools();
            //meterArchive.getMeterToolsSize();



        /* Sletter et spesifikt objekt fra meterTools, bytt ut variabelnavnet som står i parentesen
         * for å velge objektet du vil slette.
         * Den første metoden er kommentert ut, fordi det er en litt tungvint måte å gjøre
         * det på, men den funker i praksis som deleteMeterTool-metoden, bortsett fra at bruker ikke
         * får noen bekreftelsesmelding på at objektet er slettet, så det trengs en kode til*/

            //meterArchive.getMeterTools().remove(t1);
            //System.out.println("Objektet er slettet!");

            meterArchive.deleteMeterTool();

            /* Sjekker hvor mange instrumenter som er igjen i listen */
            meterArchive.getMeterToolsSize();

//--------------------------------------------------------------------------------------------------------------------//






    }
}
