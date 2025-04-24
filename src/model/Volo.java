package model;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Volo {
    private String codice;
    private String compagniaAerea;
    private String origine;
    private String destinazione;
    private LocalDate data;
    private LocalTime orarioPrevisto;
    private int ritardo;
    private StatoDelVolo stato;

    public Volo(String codice, String compagniaAerea, String origine, String destinazione,
                LocalDate data, LocalTime orarioPrevisto, int ritardo, StatoDelVolo stato) {
        this.codice = codice;
        this.compagniaAerea = compagniaAerea;
        this.origine = origine;
        this.destinazione = destinazione;
        this.data = data;
        this.orarioPrevisto = orarioPrevisto;
        this.ritardo = ritardo;
        this.stato = stato;
    }

    public String getCodice() { return codice; }
    public void setCodice(String codice) { this.codice = codice; }

    public String getCompagniaAerea() { return compagniaAerea; }
    public void setCompagniaAerea(String compagniaAerea) { this.compagniaAerea = compagniaAerea; }

    public String getOrigine() { return origine; }
    public void setOrigine(String origine) { this.origine = origine; }

    public String getDestinazione() { return destinazione; }
    public void setDestinazione(String destinazione) { this.destinazione = destinazione; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public LocalTime getOrarioPrevisto() { return orarioPrevisto; }
    public void setOrarioPrevisto(LocalTime orarioPrevisto) { this.orarioPrevisto = orarioPrevisto; }

    public int getRitardo() { return ritardo; }
    public void setRitardo(int ritardo) { this.ritardo = ritardo; }

    public StatoDelVolo getStato() { return stato; }
    public void setStato(StatoDelVolo stato) { this.stato = stato; }

    @Override
    public String toString() {
        return "Volo{" + "codice='" + codice + "', compagnia='" + compagniaAerea + "', origine='" + origine +
                "', destinazione='" + destinazione + "', data=" + data + ", orario=" + orarioPrevisto + ", stato=" + stato + '}';
    }
}