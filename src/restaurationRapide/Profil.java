package restaurationRapide;

import java.lang.Enum;
// Classe Profil
public class Profil {
	private String nom, prenom, login, mdp;
	private Boolean isConnecte;
	// Constructeur de la classe
    public Profil (String nom, String prenom, String mdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.login = prenom+"."+nom;
        this.mdp = mdp;
        this.isConnecte = Boolean.FALSE;
    }
    
    /* Getters */
    // Getter sur le nom du profil
    public String getNom() {
        return this.nom;
    }
    // Getter sur le prénom du profil
    public String getPrenom() {
        return this.prenom;
    }
    // Getter sur le mot de passe du profil
    public String getMdp() {
        return this.mdp;
    }
    // Tester si l'utilisateur est connecté
    public Boolean isConnecte() {
        return this.isConnecte;
    }
    // Se connecter
    public void connexionProfil() {
        this.isConnecte = Boolean.TRUE;
    }
    // Correspondance du profil
    public Boolean selectProfil(String login, String mdp) {
        if (login.compareTo(this.login) == 0) {
            if (mdp.compareTo(this.getMdp()) == 0) {
                return Boolean.TRUE;
            }
        }        
        return Boolean.FALSE;
    }
    // Type énumératif du profil (Client, Personnel, Gérant)
    public enum TypeProfil {
    	Client,
    	Personnel, 
    	Gerant;
    }
}
