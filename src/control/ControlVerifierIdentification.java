package control;

import model.Client;
import restaurationRapide.BDClient;
import restaurationRapide.BDPersonnel;
import restaurationRapide.ProfilUtilisateur;
import model.Personnel;

public class ControlVerifierIdentification {

	private BDClient bdClient;
	private BDPersonnel bdPersonnel;
	
	public ControlVerifierIdentification(BDClient bdClient, BDPersonnel bdPersonnel) {
		this.bdClient = bdClient;
		this.bdPersonnel = bdPersonnel;
	}
	
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
