package control;
import restaurationRapide.BDClient;
import restaurationRapide.BDPersonnel;
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

    public void creerProfil(TypeProfil profil, String nom, String prenom, String mdp) {
        switch (profil) {
            case Gerant:
                Personnel gerant = new Personnel(nom, prenom, mdp);
                gerant.definirGerant();
                laBDPersonnel.ajouterPersonnel(gerant);
                break;

            case Personnel:
                Personnel perso = new Personnel(nom, prenom, mdp);
                laBDPersonnel.ajouterPersonnel(perso);
                break;

            case Client:
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
}