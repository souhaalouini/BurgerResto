package restaurationRapide;

import java.util.HashMap;
import java.util.Map;
// Classe BDPersonnel (base de données du personnel du resto)
public class BDPersonnel {
	private Map<Integer, Personnel> hm;
    Integer nbPersonnel;
    // Constructeur de la classe
    public BDPersonnel() {
        this.hm = new HashMap<>();
        nbPersonnel = 0;
    }
    // Ajouter un personnel à la base de données
    public void ajouterPersonnel(Personnel personnel) {
        this.hm.put(nbPersonnel, personnel);
        nbPersonnel++;
    }
    // Connexion d'un personnel à la base de données
    public Integer connexionPersonnel(String login, String mdp) {
        for (Integer i = 0; i < nbPersonnel; i++) {
            if (this.hm.get(i).selectProfil(login, mdp)) {
            	this.hm.get(i).connexionProfil();
                return i;
            }
        }
        return -1;
    }
    // Redéfinition de la méthode toString()
    @Override
    public String toString() {
        Integer i;
        String data = "";

        for (i = 0; i < nbPersonnel; i++) {
            data += ("--| Compte " + (Integer.valueOf(i + 1)).toString() + " :\n");
            data += ("------| Nom : " + hm.get(i).getNom() + "\n");
            data += ("------| Prenom : " + hm.get(i).getPrenom() + "\n");
            data += ("------| Gerant : " + hm.get(i).isGerant().toString().toUpperCase() + "\n\n");

        }
        return data;
    }
    // Obtenir le numéro du personnel
    public Personnel getPersonnel(Integer numprofil) {
        return this.hm.get(numprofil);
    }
}
