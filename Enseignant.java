package org.example.Model.Enseignant;

public class Enseignant {
    private String nom;
    private String prenom;
    private String matiere;

    public Enseignant(String nom, String prenom, String matiere) {
        this.nom = nom;
        this.prenom = prenom;
        this.matiere = matiere;
    }

    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getMatiere() { return matiere; }

    public void afficherInfos() {
        System.out.println("Enseignant: " + prenom + " " + nom + " - Matière: " + matiere);
    }
}

