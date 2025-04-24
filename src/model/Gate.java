package model;

public class Gate {
    private int numero;

    public Gate(int numero) {
        this.numero = numero;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    @Override
    public String toString() {
        return "Gate{" + "numero=" + numero + '}';
    }
}