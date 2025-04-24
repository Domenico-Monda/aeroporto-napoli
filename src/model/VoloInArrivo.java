package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class VoloInArrivo extends Volo {

    public VoloInArrivo(String codice, String compagniaAerea, String origine,
                        LocalDate data, LocalTime orarioPrevisto, int ritardo, StatoDelVolo stato) {
        super(codice, compagniaAerea, origine, "Napoli", data, orarioPrevisto, ritardo, stato);
    }

    @Override
    public String toString() {
        return super.toString() + " [Arrivo]";
    }
}