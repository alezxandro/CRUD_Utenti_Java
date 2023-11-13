package main;

import java.util.ArrayList;
import java.util.List;

import model.*;
import controller.*;

public class Test {
    public static void main(String[] args) {
        Utente utente = new Utente("null", "null");

        List<Utente> utenti = new ArrayList<>();
        utenti.add(utente);

        AuthenticationController authenticationController = new AuthenticationController(utenti);

        authenticationController.login("null", "null");

        authenticationController.creaUtente("null", "null");

        authenticationController.rimuoviUtente(utente);

        UserController userController = new UserController(utente);

        userController.visualizzaProfilo();

        userController.aggiornaProfilo();

    }
}
