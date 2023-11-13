package controller;

import java.util.List;

import model.Utente;

public class AuthenticationController {
    private List<Utente> utenti;

    public AuthenticationController(List<Utente> utenti) {
        this.utenti = utenti;
    }
}
