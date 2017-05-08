package control;
import model.Profil;

public class ControlCreerProfil {
	private BDClient maBDClient;
    private BDPersonnel maBDPersonnel;

    public ControlCreerProfil(BDClient bdClient, BDPersonnel bdPersonnel) {
        this.maBDClient = bdClient;
        this.maBDPersonnel = bdPersonnel;
    }

    public void creerProfil(ProfilUtilisateur profil, String nom, String prenom, String mdp) {
        switch (profil) {
            case GERANT:
                Personnel gerant = new Personnel(nom, prenom, mdp);
                gerant.definirGerant();
                maBDPersonnel.ajouterPersonnel(gerant);
                break;

            case PERSONNEL:
                Personnel perso = new Personnel(nom, prenom, mdp);
                maBDPersonnel.ajouterPersonnel(perso);
                break;

            case CLIENT:
                Client clicli = new Client(nom, prenom, mdp);
                maBDClient.ajouterClient(clicli);
                break;
        }
    }

    public String visualiserBDUtilisateur() {
        return "Liste compte de type client :\n" + maBDClient.toString();
    }

    public String visualiserBDPersonnel() {
        return "Liste compte de type personnel :\n" + maBDPersonnel.toString();
    }

}

	}
}
