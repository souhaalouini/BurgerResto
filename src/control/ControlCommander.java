package control;

import restaurationRapide.Carte;
import restaurationRapide.Commande;
import restaurationRapide.Client;
import restaurationRapide.BDClient;
import restaurationRapide.BDCommande;

public class ControlCommander {
	
	private Carte laCarte;
    private BDClient laBDClient;
    private BDCommande laBDCommande;

    public ControlCommander(Carte carte, BDClient bdClient, BDCommande bdCommande) {
        this.laCarte = carte;
        this.laBDClient = bdClient;
        this.laBDCommande = bdCommande;
    }
    
    @Override
    public String toString() {
        return laBDCommande.toString();
    }
    
    public String getListeHamburger() {
        return laCarte.getListeHamburger();
    }
    
    public String getListeAccompagnement() {
        return laCarte.getListeAccompagnement();
    }

    public String getListeBoisson() {
        return laCarte.getListeBoisson();
    }
    
    public int enregistrerCommande(Commande commande) {
        return laBDCommande.ajouterCommande(commande);
    }
    
    public boolean isCarteRenseignee(int numClient) {
        Client client = laBDClient.getClient(numClient);
        return client.isCarteRenseignee();
    }
}
