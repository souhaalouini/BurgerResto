package restaurationRapide;

public class Commande {
	private Aliment hamburger, accompagnement, boisson;
	private static int nbCommandes = 0;
	private int numCommande;  
	private int numClient;
	
	public Aliment getHamburger() {
        return hamburger;
    }

    public Aliment getAccompagnement() {
        return accompagnement;
    }
    
    public Aliment getBoisson() {
        return boisson;
    }
    
    public Commande(Aliment hamburger, Aliment accompagnement, Aliment boisson, int numClient) {
    	this.boisson = boisson;
        this.accompagnement = accompagnement;
        this.hamburger = hamburger;
        this.numClient = numClient;
	}
    
    public int getNumClient() {
        return numClient;
    }
    
    public static int getNbCommandes(){
		return nbCommandes;
	}
    
	public String toString(){
		return "Commande numero :"+numCommande+"du client numero"+numClient;
	}
}
