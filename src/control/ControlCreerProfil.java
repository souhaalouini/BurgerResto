package control;
import restaurationRapide.BDClient;
import restaurationRapide.BDPersonnel;
import restaurationRapide.ProfilUtilisateur;
import model.Client;
import model.Personnel;
import model.Profil.TypeProfil;

public class ControlCreerProfil {
	private BDClient laBDClient;
    private BDPersonnel laBDPersonnel;

    public ControlCreerProfil(BDClient bdClient, BDPersonnel bdPersonnel) {
        this.laBDClient = bdClient;
        this.laBDPersonnel = bdPersonnel;
    }

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

    public String visualiserBDClient() {
        return "Compte de type client :\n" + laBDClient.toString();
    }

    public String visualiserBDPersonnel() {
        return "Compte de type personnel :\n" + laBDPersonnel.toString();
    }

	public String visualiserBDUtilisateur() {
		// TODO Auto-generated method stub
		return this.laBDClient.toString();
	}
}