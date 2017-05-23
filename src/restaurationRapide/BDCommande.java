package restaurationRapide;

import java.util.HashMap;
import java.util.Map;
// Classe BDCommande (base de données des commandes du resto)
public class BDCommande {
	// Intégration du code de la commande
	private static Map<Integer, Commande> hm;
	private static Integer nbCommandes;
	// Constructeur de la classe
	public BDCommande() {
		hm = new HashMap<>();
        nbCommandes = 0;
	}
	// Redéfinition de la méthode toString()
	public String toString(){
		String liste = "Liste des commandes : \n";
        for (int i = 0; i < nbCommandes; i++) {
            liste += "-| Commande n°" + (i + 1) + "\n" + hm.get(i).toString() + "\n";
        }
        return liste;
    }
	// Obtenir le nombre de commandes à préparer
	public static int getNbCommandes(){
		return hm.size();
	}
	// Ajouter une commande à la base de données
	public int ajouterCommande(Commande commande) {
        this.hm.put(nbCommandes, commande);
        nbCommandes++;
        return (nbCommandes - 1);
    }
	// Récupérer une commande
    public Commande recupererCommande(int n) {
        return hm.get(n);
    }
}
