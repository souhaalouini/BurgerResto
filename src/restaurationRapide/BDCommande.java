package restaurationRapide;

import java.util.HashMap;
import java.util.Map;

import model.Client;
import model.Aliment;
import model.Commande;
import model.Client;

public class BDCommande {
	private static int nbCommandes = 0;
	private int numCommande;  
	private int numClient;
	public void Commande(int nCl){
		nbCommandes++;
		numCommande = nbCommandes;
		numClient = nCl;
	}
	public String toString(){
		return "Commande numéro :"+numCommande+"du client numéro"+numClient;
	}
	public static int getNbCommandes(){
		return nbCommandes;
	}
}
