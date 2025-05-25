package model;

import java.time.LocalDate;
import java.time.LocalTime;
import controller.Controller;


public class Main {
    public static void main(String[] args) {
        Gate gate5 = new Gate(5);
        VoloInPartenza volo1 = new VoloInPartenza("AZ123", "ITA Airways", "Roma",
                LocalDate.of(2025, 5, 12), LocalTime.of(10, 30), 0, StatoDelVolo.PROGRAMMATO, gate5);

        Passeggero p1 = new Passeggero("Luca", "Rossi", "AB123456");
        Prenotazione pr = new Prenotazione("TK001", "12A", StatoDellaPrenotazione.CONFERMATA);
        Bagaglio b1 = new Bagaglio("BG001", StatoDelBagaglio.CARICATO);

        Controller controller = new Controller();

// Crea un volo di test
        VoloInPartenza volo = new VoloInPartenza(
                "AZ123",
                "ITA Airways",
                "Roma",
                LocalDate.of(2025, 5, 24),
                LocalTime.of(10, 30),
                0,
                StatoDelVolo.PROGRAMMATO,
                new Gate(5)
        );

// Aggiunge al controller
        controller.aggiungiVolo(volo);

// Cerca il volo
        Volo trovato = controller.cercaVolo("AZ123");
        if (trovato != null) {
            System.out.println("Volo trovato: " + trovato);
        }

// Aggiunge una prenotazione
        Passeggero p = new Passeggero("Luca", "Rossi", "AB123456");
        Prenotazione prenotazioneTest = new Prenotazione("TK001", "12A", StatoDellaPrenotazione.CONFERMATA);
        controller.prenotaVolo(pr);

// Stampa le prenotazioni
        System.out.println("Prenotazioni:");
        for (Prenotazione pren : controller.getPrenotazioni()) {
            System.out.println(pren);
        }


        System.out.println(volo1);
        System.out.println(p1);
        System.out.println(pr);
        System.out.println(b1);
    }
}