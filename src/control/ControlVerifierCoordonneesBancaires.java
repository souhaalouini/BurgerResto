/* Controler : Définition des méthodes du cas VerifierCoordonneesBancaires */

package control;

import restaurationRapide.BDClient;
// Control du cas VerifierCoordonneesBancaires
public class ControlVerifierCoordonneesBancaires {
	BDClient bdClient;
	Integer numCarte;
	String dateCarte;
	// Constructor
	public ControlVerifierCoordonneesBancaires() {
		this.bdClient = bdClient;
	}
	// Verifier les coordonnées bancaires (retourne vrai)
	public Boolean verifierCoordonneesBancaires(Integer numCarte, String dateCarte) {
		this.numCarte = numCarte;
		this.dateCarte = dateCarte;
		return true;
	}
}
