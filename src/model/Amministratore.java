package model;

public class Amministratore extends Utente {

    public Amministratore(String login, String password) {
        super(login, password);
    }

    @Override
    public String toString() {
        return "Amministratore{" + "login='" + getLogin() + '\'' + '}';
    }
}