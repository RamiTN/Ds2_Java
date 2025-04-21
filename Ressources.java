package org.example.Model.Ressources;

public class Ressources {
    private String titre;
    private String type; // ex: "PDF", "Vidéo", etc.
    private String lien;

    public Ressources(String titre, String type, String lien) {
        this.titre = titre;
        this.type = type;
        this.lien = lien;
    }

    public String getTitre() { return titre; }
    public String getType() { return type; }
    public String getLien() { return lien; }

    public void afficher() {
        System.out.println("Ressource: " + titre + " (" + type + ") - Lien: " + lien);
    }
}
