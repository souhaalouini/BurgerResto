package restaurationRapide;
// Classe Client, héritière de la classe Profil
public class Client extends Profil {
	Integer numCarte;
	String dateCarte;
	// Constructeur de la classe
	public Client(String nom, String prenom, String mdp) {
        super(nom, prenom, mdp); 
    }
	// Enregistrer ses coordonnées bancaires 
	public boolean enregistrerCoordonneesBancaires(Integer numCarte, String dateCarte) {
        this.dateCarte = dateCarte;
        this.numCarte = numCarte;
        return true;
    }
	// Tester si la carte bancaire est renseignée pour pouvoir passer une commande
	public boolean isCarteRenseignee(){
        if(numCarte == null) {
            return false;
        }
        return true;
    }
	// Obtenir les coordonnées bancaires du client
	public String getCoordonneesBancaires(Integer numClient) {
		return numCarte + " (" + dateCarte + ")";
	}
}
