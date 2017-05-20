package restaurationRapide;

public class Personnel extends Profil {
	private Boolean gerant;
    private int idPersonnel;
    
    public Personnel(String nom, String prenom, String mdp) {
        super(nom, prenom, mdp); 
        gerant = Boolean.FALSE;
    }
    
    public void definirGerant() {
        gerant = Boolean.TRUE;
    }
    
    public Boolean isGerant() {
        return gerant;
    }
}
