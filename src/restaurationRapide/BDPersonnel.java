package restaurationRapide;

import java.util.HashMap;
import java.util.Map;
import model.Client;
import model.Personnel;
import model.Profil;

public class BDPersonnel {
	private Map<Integer, Personnel> hm;
    Integer nbPersonnel;

    public BDPersonnel() {
        this.hm = new HashMap<>();
        nbPersonnel = 0;
    }

    public void ajouterPersonnel(Personnel personnel) {
        this.hm.put(nbPersonnel, personnel);
        nbPersonnel++;
    }
    
    public Integer connexionPersonnel(String login, String mdp) {
        for (Integer i = 0; i < nbPersonnel; i++) {
            if (this.hm.get(i).selectProfil(login, mdp)) {
                return i;
            }
        }
        return -1;
    }

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
}
