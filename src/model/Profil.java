package model;

import java.lang.Enum;

public class Profil {
	private String nom, prenom, login, mdp;
	Boolean isConnecte;

    public Profil (String nom, String prenom, String mdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.login = prenom+"."+nom;
        this.mdp = mdp;
        this.isConnecte = Boolean.FALSE;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }
    
    public String getMdp() {
        return this.mdp;
    }
    
    public Boolean isConnecte() {
        return this.isConnecte;
    }
    
    public Boolean selectProfil(String login, String mdp) {
        if (login.compareTo(this.login) == 0) {
            if (mdp.compareTo(this.getMdp()) == 0) {
                return Boolean.TRUE;
            }
        }        
        return Boolean.FALSE;
    }
    
    public enum TypeProfil {
    	Client,
    	Personnel, 
    	Gerant;
    }
}
