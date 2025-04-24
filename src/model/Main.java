package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Gate gate5 = new Gate(5);
        VoloInPartenza volo1 = new VoloInPartenza("AZ123", "ITA Airways", "Roma",
                LocalDate.of(2025, 5, 12), LocalTime.of(10, 30), 0, StatoDelVolo.PROGRAMMATO, gate5);

        Passeggero p1 = new Passeggero("Luca", "Rossi", "AB123456");
        Prenotazione pr = new Prenotazione("TK001", "12A", StatoDellaPrenotazione.CONFERMATA);
        Bagaglio b1 = new Bagaglio("BG001", StatoDelBagaglio.CARICATO);

        System.out.println(volo1);
        System.out.println(p1);
        System.out.println(pr);
        System.out.println(b1);
    }
}