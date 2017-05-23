package restaurationRapide;
// Classe Commande
public class Commande {
	private Aliment hamburger, accompagnement, boisson;
	private static int nbCommandes = 0;
	private int numCommande;  
	private int numClient;
	// Récupérer un hamburger
	public Aliment getHamburger() {
        return hamburger;
    }
	// Récupérer un accompagnement
    public Aliment getAccompagnement() {
        return accompagnement;
    }
    // Récupérer une boisson
    public Aliment getBoisson() {
        return boisson;
    }
    // Constructeur de la classe
    public Commande(Aliment hamburger, Aliment accompagnement, Aliment boisson, int numClient) {
    	this.boisson = boisson;
        this.accompagnement = accompagnement;
        this.hamburger = hamburger;
        this.numClient = numClient;
	}
    // Récupérer le numéro du client
    public int getNumClient() {
        return numClient;
    }
    // Récupérer le nombre de commandes à traiter
    public static int getNbCommandes(){
		return nbCommandes;
	}
    // Redéfinition de la méthode toString()
	public String toString(){
		return "Commande numero :"+numCommande+"du client numero"+numClient;
	}
}
