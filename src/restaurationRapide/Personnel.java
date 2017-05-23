package restaurationRapide;
// Classe Personnel, héritière de la classe Profil
public class Personnel extends Profil {
	private Boolean gerant;
    private int idPersonnel;
    // Constructeur de la classe
    public Personnel(String nom, String prenom, String mdp) {
        super(nom, prenom, mdp); 
        gerant = Boolean.FALSE;
    }
    // Définir un personnel comme étant gérant du resto
    public void definirGerant() {
        gerant = Boolean.TRUE;
    }
    // Tester si un personnel est un gérant du resto
    public Boolean isGerant() {
        return gerant;
    }
}
