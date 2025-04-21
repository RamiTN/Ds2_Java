package org.example.Model.Historique;

import java.time.LocalDateTime;

public class Historique {
    private String action;
    private LocalDateTime dateHeure;

    public Historique(String action) {
        this.action = action;
        this.dateHeure = LocalDateTime.now(); // sets current date/time
    }

    public String getAction() { return action; }
    public LocalDateTime getDateHeure() { return dateHeure; }

    public void afficher() {
        System.out.println(dateHeure + " - " + action);
    }
}
