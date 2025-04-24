package model;

public class Bagaglio {
    private String codice;
    private StatoDelBagaglio stato;

    public Bagaglio(String codice, StatoDelBagaglio stato) {
        this.codice = codice;
        this.stato = stato;
    }

    public String getCodice() { return codice; }
    public void setCodice(String codice) { this.codice = codice; }

    public StatoDelBagaglio getStato() { return stato; }
    public void setStato(StatoDelBagaglio stato) { this.stato = stato; }

    @Override
    public String toString() {
        return "Bagaglio{" + "codice='" + codice + "', stato=" + stato + '}';
    }
}