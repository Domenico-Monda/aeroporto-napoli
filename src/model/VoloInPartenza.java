package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class VoloInPartenza extends Volo {
    private Gate gateImbarco;

    public VoloInPartenza(String codice, String compagniaAerea, String destinazione,
                          LocalDate data, LocalTime orarioPrevisto, int ritardo, StatoDelVolo stato, Gate gateImbarco) {
        super(codice, compagniaAerea, "Napoli", destinazione, data, orarioPrevisto, ritardo, stato);
        this.gateImbarco = gateImbarco;
    }

    public Gate getGateImbarco() { return gateImbarco; }
    public void setGateImbarco(Gate gateImbarco) { this.gateImbarco = gateImbarco; }

    @Override
    public String toString() {
        return super.toString() + " [Gate=" + gateImbarco + "]";
    }
}