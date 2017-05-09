package model;

public class Commande {
	private static int nbCommandes = 0;
	private int numCommande;  
	private int numClient;
	public Commande(int nCl){
		nbCommandes++;
		numCommande = nbCommandes;
		numClient = nCl;
	}
	public String toString(){
		return "Commande numero :"+numCommande+"du client numero"+numClient;
	}
	public static int getNbCommandes(){
		return nbCommandes;
	}
}
