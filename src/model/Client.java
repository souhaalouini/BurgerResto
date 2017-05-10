package model;
import model.Profil;

public class Client extends Profil {
	Integer numCarte;
	String dateCarte;
	
	public Client(String nom, String prenom, String mdp) {
        super(nom, prenom, mdp); 
    }
	
	public boolean enregistrerCoordonneesBancaires(Integer numCarte, String dateCarte) {
        this.dateCarte = dateCarte;
        this.numCarte = numCarte;
        return true;
    }

}
