ARBEIDSKRAV PGR101
#
#
#
# Author(Line Nathalie Rønning)
# Version (3.2)
#
#
# Hei og velkommen til programmet mitt! Jeg har prøvd å lage det ganske interaktivt(ikke med GUI, kanskje neste gang :P)
# sånn at brukeren av programmet kan, hvis han eller hun vil, skrive direkte til programmet ved hjelp av en skanner.
#
#
#
#
# I dette prosjektet finnes det 6 klasser:
# Client
# MeterArchive
# Meter 
# Clock
# Thermometer
# Weight 
#
#
#
# CLIENT
# Inneholder prosjektets Main- metode. Det er herfra det er meningen at man skal styre hele prosjektet ved å ta i
# bruk metodene som ligger i MeterArchive.
#
# METERARCHIVE
# Prosjektets controller - denne klassen er ansvarlig for å legge til nye, slette, hente ut og endre objekter
#
# METER
# Superklasse - dette er superklassen til Clock, Thermometer og Weight og innehar derfor egenskaper som er felles
# for de tre klassene, som f.eks. registeringsnummer, plassering og status.
#
# Registreringsnummeret til objektene er ikke optimale i denne versjonen, fordi at sånn koden er skrevet nå,
# fungerer ikke registreringsnummeret som en primærnøkkel dersom man faktisk skulle brukt programmet som et type arkiv.
# Når man legger inn regLetter+regNr i et objekt er det ingen sjekk som forteller oss om denne kombinasjonen er
# blitt brukt før. Dette ville man selvfølgelig rettet opp i dersom programmet skulle blitt brukt i virkeligheten.
#
# CLOCK
# Subklasse av Meter - inneholder min/max verdiene det er mulig å måle tid med.
# Utstyrt med getter og setter metoder for å sette og returnere min/max tid.
#
# THERMOMETER
# Subklasse av Meter - inneholder min/max verdiene det er mulig å måle temperatur med.
# Utstyrt med getter og setter metoder for å sette og returnere min/max temperatur.
#
# WEIGHT
# Subklasse av Meter - inneholder min/max verdiene det er mulig å måle vekt med.
# Utstyrt med getter og setter metoder for å sette og returnere min/max vekt.
#
#
#
#
#
#
# Alle metodene som skulle skrives og initialiseres er der, men jeg har ikke nødvendigvis løst alt sånn som det står skrevet
# i oppgaveteksten. Metodene som(egentlig) skulle ha String registreringsnummer som parameter har jeg latt stå tomme.
# I skrivende stund kjører alle metodene som de skal og alle metodene som står i oppgaveteksten er der, det var det viktigste
# for meg. At jeg klarte å skrive et program som faktisk kompilerer og hvor alle metodene som skulle være med er der.
#
#
#
# ENJOY!
#
#
# Line Nathalie Rønning



