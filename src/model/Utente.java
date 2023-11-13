package model;

public class Utente {
    private String username;
    private String password;

    public Utente(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkPassword(String password) {
        return this.getPassword().equals(password);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Utente) {
            Utente utente = (Utente) obj;
            return this.getUsername().equals(utente.getUsername());
        }
        return false;
    }

}
