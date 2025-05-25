package controller;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Volo> voli;
    private List<Prenotazione> prenotazioni;

    public Controller() {
        this.voli = new ArrayList<>();
        this.prenotazioni = new ArrayList<>();
    }

    public void aggiungiVolo(Volo volo) {
        voli.add(volo);
    }

    public Volo cercaVolo(String codice) {
        for (Volo v : voli) {
            if (v.getCodice().equalsIgnoreCase(codice)) {
                return v;
            }
        }
        return null;
    }

    public void prenotaVolo(Prenotazione p) {
        prenotazioni.add(p);
    }

    public List<Volo> getVoli() {
        return voli;
    }

    public List<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }
}
