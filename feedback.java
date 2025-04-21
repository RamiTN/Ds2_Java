package org.example.Model.feedback;

public class feedback {
    private String contenu;
    private String auteur; // could be nom de l'étudiant ou enseignant

    public feedback(String contenu, String auteur) {
        this.contenu = contenu;
        this.auteur = auteur;
    }

    public String getContenu() { return contenu; }
    public String getAuteur() { return auteur; }

    public void afficher() {
        System.out.println("Feedback de " + auteur + ": " + contenu);
    }
}
