package controller;

import java.util.List;

import model.Utente;

public class AuthenticationController {
    private List<Utente> utenti;

    public AuthenticationController(List<Utente> utenti) {
        this.utenti = utenti;
    }

    //controlla se l'utente esiste e se la password è corretta
    public void login(String username, String password) {
        for (Utente utente : utenti) {
            if (utente.getUsername().equals(username)) {
                if (utente.checkPassword(password)) {
                    System.out.println("Login riuscito!");
                    UserController userController = new UserController(utente);
                    return;
                } else {
                    System.out.println("Password errata!");
                    return;
                }
            }
        }
        System.out.println("Utente non trovato!");
    }

    //crea un nuovo utente da aggiungere alla lista
    public void creaUtente(String username, String password) {
        if (!checkUtente(username)) {
            Utente nuovoUtente = new Utente(username, password);
            utenti.add(nuovoUtente);
        }
    }

    //controlla se l'utente esiste già
    public boolean checkUtente(String username) {
        for (Utente utente : utenti) {
            if (utente.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void rimuoviUtente(Utente utente) {
        utenti.removeIf(u -> u.equals(utente));
    }

}
