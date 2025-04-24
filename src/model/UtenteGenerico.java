package model;

public class UtenteGenerico extends Utente {

    public UtenteGenerico(String login, String password) {
        super(login, password);
    }

    @Override
    public String toString() {
        return "UtenteGenerico{" + "login='" + getLogin() + '\'' + '}';
    }
}