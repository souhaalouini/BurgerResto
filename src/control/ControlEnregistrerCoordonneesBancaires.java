/* Controler : Définition des méthodes du cas EnregistrerCoordonneesBancaires */

package control;

import restaurationRapide.BDClient;
// Control du cas EnregistrerCoordonneesBancaires
public class ControlEnregistrerCoordonneesBancaires {
	private BDClient bdClient;
	// Constructor
	public ControlEnregistrerCoordonneesBancaires(BDClient bdClient) {
		this.bdClient = bdClient;
	}
	// Visualiser la BDClient
	public String visualiserBDClient() {
		return bdClient.toString();
	}
	// Enregistrer les coordonnées bancaires d'un client (retourne vrai si réussi, faux sinon)
	public Boolean enregistrerCoordonneesBancaires(Integer numClient, Integer numCarte, String dateCarte) {
		return bdClient.getClient(numClient).enregistrerCoordonneesBancaires(numCarte, dateCarte);
	}
}
