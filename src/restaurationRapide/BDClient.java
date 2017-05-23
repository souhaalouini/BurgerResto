package restaurationRapide;

import java.util.HashMap;
import java.util.Map;
	// Classe BDClient (base de données des clients du resto)
	public class BDClient {
		// Intégration du code client
	    private Map<Integer, Client> hm;
	    Integer nbClient;
	    // Constructeur de la classe
	    public BDClient() {
	        this.hm = new HashMap<>();
	        nbClient = 0;
	    }
	    // Ajouter un client à la base de données
	    public void ajouterClient(Client client) {
	        this.hm.put(nbClient, client);
	        nbClient++;
	    }
	    // Connexion d'un client à la base de données
	    public Integer connexionClient(String login, String mdp) {
	        for (Integer i = 0; i < nbClient; i++) {
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
	        
	        // dans Profil avec hm
	        for (i = 0; i < nbClient; i++) {
	            data += ("--| Compte n°" + (Integer.valueOf(i + 1)).toString() + " :\n");
	            data += ("------| Nom : " + hm.get(i).getNom() + "\n");
	            data += ("------| Prenom : " + hm.get(i).getPrenom() + "\n");
	            data += ("------| Password : " + hm.get(i).getMdp() + "\n");
	        }
	        return data;

	    }
	    // Obtenir le numéro du client
	    public Client getClient(Integer numprofil) {
	        return this.hm.get(numprofil);
	    }
	}

