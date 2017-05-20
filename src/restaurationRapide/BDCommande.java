package restaurationRapide;

import java.util.HashMap;
import java.util.Map;

public class BDCommande {
	
	private static Map<Integer, Commande> hm;
	private static Integer nbCommandes;
	
	public BDCommande() {
		hm = new HashMap<>();
        nbCommandes = 0;
	}
	
	public String toString(){
		String liste = "Liste des commandes : \n";
        for (int i = 0; i < nbCommandes; i++) {
            liste += "-| Commande n°" + (i + 1) + "\n" + hm.get(i).toString() + "\n";
        }
        return liste;
    }
	
	public static int getNbCommandes(){
		return hm.size();
	}
	
	public int ajouterCommande(Commande commande) {
        this.hm.put(nbCommandes, commande);
        nbCommandes++;
        return (nbCommandes - 1);
    }

    public Commande recupererCommande(int n) {
        return hm.get(n);
    }

}
