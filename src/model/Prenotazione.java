package model;

public class Prenotazione {
    private String numeroBiglietto;
    private String postoAssegnato;
    private StatoDellaPrenotazione stato;

    public Prenotazione(String numeroBiglietto, String postoAssegnato, StatoDellaPrenotazione stato) {
        this.numeroBiglietto = numeroBiglietto;
        this.postoAssegnato = postoAssegnato;
        this.stato = stato;
    }

    public String getNumeroBiglietto() { return numeroBiglietto; }
    public void setNumeroBiglietto(String numeroBiglietto) { this.numeroBiglietto = numeroBiglietto; }

    public String getPostoAssegnato() { return postoAssegnato; }
    public void setPostoAssegnato(String postoAssegnato) { this.postoAssegnato = postoAssegnato; }

    public StatoDellaPrenotazione getStato() { return stato; }
    public void setStato(StatoDellaPrenotazione stato) { this.stato = stato; }

    @Override
    public String toString() {
        return "Prenotazione{" + "biglietto='" + numeroBiglietto + "', posto='" + postoAssegnato + "', stato=" + stato + '}';
    }
}