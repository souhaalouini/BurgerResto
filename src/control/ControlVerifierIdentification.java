/* Controler : Définition des méthodes du cas VerifierIdentification */

package control;

import restaurationRapide.BDClient;
import restaurationRapide.BDPersonnel;
import restaurationRapide.Client;
import restaurationRapide.Personnel;
import restaurationRapide.ProfilUtilisateur;
// Control du cas VerifierIdentification
public class ControlVerifierIdentification {

	private BDClient bdClient;
	private BDPersonnel bdPersonnel;
	// Constructor
	public ControlVerifierIdentification(BDClient bdClient, BDPersonnel bdPersonnel) {
		this.bdClient = bdClient;
		this.bdPersonnel = bdPersonnel;
	}
	// Verifier l'identification d'un utilisateur en vérifiant l'existence de son id dans la base de données
	public boolean verifierIdentification(ProfilUtilisateur user, int id) {
        Boolean result = Boolean.FALSE;
        
        switch (user) {
            case CLIENT:
                Client client = bdClient.getClient(id);
                result = client.isConnecte();
                break;

            case PERSONNEL:
                Personnel personnel = bdPersonnel.getPersonnel(id);
                result = personnel.isConnecte();
                break;

            case GERANT:
                Personnel gerant = bdPersonnel.getPersonnel(id);
                if (gerant.isConnecte()) {
                    result = gerant.isGerant();
                }
                break;
        }
        return result;
    }
}
