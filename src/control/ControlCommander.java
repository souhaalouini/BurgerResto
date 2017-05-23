/* Controler : Définition des méthodes du cas Commander */

package control;

import restaurationRapide.Carte;
import restaurationRapide.Commande;
import restaurationRapide.Client;
import restaurationRapide.BDClient;
import restaurationRapide.BDCommande;
// Control du cas Commander
public class ControlCommander {
	
	private Carte laCarte;
    private BDClient laBDClient;
    private BDCommande laBDCommande;
    // Constructeur du control
    public ControlCommander(Carte carte, BDClient bdClient, BDCommande bdCommande) {
        this.laCarte = carte;
        this.laBDClient = bdClient;
        this.laBDCommande = bdCommande;
    }
    // toString()
    @Override
    public String toString() {
        return laBDCommande.toString();
    }
    // Récupérer la liste des hamburgers
    public String getListeHamburger() {
        return laCarte.getListeHamburger();
    }
    // Récupérer la liste des accompagnements
    public String getListeAccompagnement() {
        return laCarte.getListeAccompagnement();
    }
    // Récupérer la liste des boissons
    public String getListeBoisson() {
        return laCarte.getListeBoisson();
    }
    // Enregistrer une commande
    public int enregistrerCommande(Commande commande) {
        return laBDCommande.ajouterCommande(commande);
    }
    // Tester sir la carte bancaire du client est renseignée
    public boolean isCarteRenseignee(int numClient) {
        Client client = laBDClient.getClient(numClient);
        return client.isCarteRenseignee();
    }
}
