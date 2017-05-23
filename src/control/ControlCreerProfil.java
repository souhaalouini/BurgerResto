/* Controler : Définition du cas CreerProfil */

package control;
import restaurationRapide.BDClient;
import restaurationRapide.BDPersonnel;
import restaurationRapide.Client;
import restaurationRapide.Personnel;
import restaurationRapide.ProfilUtilisateur;
import restaurationRapide.Profil.TypeProfil;

public class ControlCreerProfil {
	private BDClient laBDClient;
    private BDPersonnel laBDPersonnel;
    // Constructeur du control
    public ControlCreerProfil(BDClient bdClient, BDPersonnel bdPersonnel) {
        this.laBDClient = bdClient;
        this.laBDPersonnel = bdPersonnel;
    }
    // Créer un profil utilisateur (client, gérant ou personnel)
    public void creerProfil(ProfilUtilisateur profil, String nom, String prenom, String mdp) {
        switch (profil) {
            case GERANT:
                Personnel gerant = new Personnel(nom, prenom, mdp);
                gerant.definirGerant();
                laBDPersonnel.ajouterPersonnel(gerant);
                break;

            case PERSONNEL:
                Personnel perso = new Personnel(nom, prenom, mdp);
                laBDPersonnel.ajouterPersonnel(perso);
                break;

            case CLIENT:
                Client client = new Client(nom, prenom, mdp);
                laBDClient.ajouterClient(client);
                break;
        }
    }
    // Méthode qui permet de visualiser la base de données du client
    public String visualiserBDClient() {
        return "Compte de type client :\n" + laBDClient.toString();
    }
    // Méthode qui permet de visualiser la base de données du personnel
    public String visualiserBDPersonnel() {
        return "Compte de type personnel :\n" + laBDPersonnel.toString();
    }
    // Méthode qui permet de visualiser la base de données de l'utilisateur
	public String visualiserBDUtilisateur() {
		// TODO Auto-generated method stub
		return this.laBDClient.toString();
	}
}