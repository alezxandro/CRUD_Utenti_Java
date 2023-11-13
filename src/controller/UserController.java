package controller;

import model.Utente;
import java.util.Scanner;

public class UserController {
    private Utente utente;

    public UserController(Utente utente) {
        this.utente = utente;
    }

    public void visualizzaProfilo() {
        System.out.println("Username: " + utente.getUsername());

        //altre informazioni da aggiungere a Utente
    }

    

    public void aggiornaProfilo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleziona l'opzione che desideri aggiornare:");
        System.out.println("1. Username");
        System.out.println("2. Password");

        int scelta = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (scelta) {
            case 1:
                System.out.println("Inserisci il nuovo username:");
                String nuovoUsername = scanner.nextLine();
                utente.setUsername(nuovoUsername);
                break;
            case 2:
                aggiornaPassword();
                break;
            default:
                System.out.println("Scelta non valida.");
                break;
        }

    }

    //controlla se la password inserita è corretta
    public void aggiornaPassword() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la vecchia password:");
        String vecchiaPassword = scanner.nextLine();

        if (utente.checkPassword(vecchiaPassword)) {
            System.out.println("Inserisci la nuova password:");
            String nuovaPassword = scanner.nextLine();
            utente.setPassword(nuovaPassword);
        } else {
            System.out.println("Password errata.");
        }
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleziona l'opzione che desideri:");
        System.out.println("1. Visualizza profilo");
        System.out.println("2. Aggiorna profilo");

        int scelta = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (scelta) {
            case 1:
                visualizzaProfilo();
                break;
            case 2:
                aggiornaProfilo();
                break;
            default:
                System.out.println("Scelta non valida.");
                break;
        }

    }
    


}
