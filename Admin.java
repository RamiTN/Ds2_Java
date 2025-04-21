package org.example.Model.Admin;

public class Admin {
    private String nomUtilisateur;
    private String motDePasse;

    public Admin(String nomUtilisateur, String motDePasse) {
        this.nomUtilisateur = nomUtilisateur;
        this.motDePasse = motDePasse;
    }

    public String getNomUtilisateur() { return nomUtilisateur; }
    public String getMotDePasse() { return motDePasse; }

    public void afficherInfos() {
        System.out.println("Admin: " + nomUtilisateur);
    }
}
