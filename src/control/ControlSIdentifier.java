/* Controler : Définition des méthodes du cas SIdentifier */

package control;
import restaurationRapide.BDClient;
import restaurationRapide.BDPersonnel;
import restaurationRapide.ProfilUtilisateur;
// Control du cas SIdentifier
public class ControlSIdentifier {
	
	BDClient bdClient;
	BDPersonnel bdPersonnel;
	// Constructor	
	public ControlSIdentifier(BDClient bdClient, BDPersonnel bdPersonnel) {
		this.bdClient = bdClient;
		this.bdPersonnel = bdPersonnel;
	}
	// S'identifier -> Vérification dans la base de données
	public Integer sIdentifier(ProfilUtilisateur user, String login, String mdp) {
		
		Integer retourIdentification = 0;

        switch (user) {
            case CLIENT:
                retourIdentification = this.bdClient.connexionClient(login, mdp);
                break;

            case PERSONNEL:
                retourIdentification = this.bdPersonnel.connexionPersonnel(login, mdp);
                break;

            case GERANT:
                retourIdentification = this.bdPersonnel.connexionPersonnel(login, mdp);
                break;
        }
        if (retourIdentification > -1) {
                    System.out.println("Indentification [OK] : " + retourIdentification.toString());
        } 
        else {
                    System.out.println("Indentification [ERREUR] : Ce compte n'existe pas...");
        }
        return retourIdentification;
	}
	// Visualiser la BDClient
	public String visualiserBDClient() {
        return "Compte de type client :\n" + bdClient.toString();
    }
	// Visualiser la BDPersonnel
    public String visualiserBDPersonnel() {
        return "Compte de type personnel :\n" + bdPersonnel.toString();
    }

}
