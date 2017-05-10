package control;
import restaurationRapide.BDClient;
import restaurationRapide.BDPersonnel;
import restaurationRapide.ProfilUtilisateur;

public class ControlSIdentifier {
	
	BDClient bdClient;
	BDPersonnel bdPersonnel;
	
	public ControlSIdentifier(BDClient bdClient, BDPersonnel bdPersonnel) {
		this.bdClient = bdClient;
		this.bdPersonnel = bdPersonnel;
	}
	
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
	
	public String visualiserBDClient() {
        return "Compte de type client :\n" + bdClient.toString();
    }

    public String visualiserBDPersonnel() {
        return "Compte de type personnel :\n" + bdPersonnel.toString();
    }

}
