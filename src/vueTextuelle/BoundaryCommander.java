package vueTextuelle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import control.ControlCommander;
import control.ControlVerifierIdentification;
import restaurationRapide.Carte;
import restaurationRapide.Commande;
import restaurationRapide.ProfilUtilisateur;
import vueTextuelle.BoundaryEnregistrerCoordonneesBancaires;
// Boundary Commander
public class BoundaryCommander {
	
	private ControlCommander controlCommander;
	private ControlVerifierIdentification controlVerifierIdentification;
	private BoundaryEnregistrerCoordonneesBancaires boundaryEnregistrerCoordonneesBancaires;
	// Constructor
	public BoundaryCommander(ControlCommander controlCommander, ControlVerifierIdentification controlVerifierIdentification, BoundaryEnregistrerCoordonneesBancaires boundaryEnregistrerCoordonneesBancaires) {
		this.controlCommander = controlCommander;
		this.controlVerifierIdentification = controlVerifierIdentification;
		this.boundaryEnregistrerCoordonneesBancaires = boundaryEnregistrerCoordonneesBancaires;
    }

    public void commander(int numClient) {
    	try {
    		Integer numHamburger;
    		Integer numAccompagnement;
    		Integer numBoisson;
    	
    		int numCommande;
    	
    		InputStreamReader reader = new InputStreamReader(System.in);
    		BufferedReader bf = new BufferedReader(reader);
    	
    		if(!controlVerifierIdentification.verifierIdentification(ProfilUtilisateur.CLIENT, numClient)) {
    			System.out.println("[ ERREUR ] : Client non enregistré.");
    		}
    		System.out.println("[ ConnexionOK ] : Client connecté.");
    	
    		System.out.println("Veuillez sélectionner le numéro de votre hamburger : " + controlCommander.getListeHamburger());
    		numHamburger = new Integer(bf.readLine());
    		
    		System.out.println("Veuillez sélectionner le numéro de votre accompagnement : " + controlCommander.getListeAccompagnement());
    		numAccompagnement = new Integer(bf.readLine());
    		
    		System.out.println("Veuillez sélectionner le numéro de votre boisson : " + controlCommander.getListeBoisson());
    		numBoisson = new Integer(bf.readLine());
    		
    		if (!controlCommander.isCarteRenseignee(numClient)) {
    			System.out.println("[ ERREUR ] : Carte client non renseignée.");
    			while(!boundaryEnregistrerCoordonneesBancaires.renseignerCoordonneesBancaires(numClient));
    		}
    		
    		numCommande = controlCommander.enregistrerCommande(new Commande(
    				Carte.getInstance().getHamburger().get(numHamburger - 1),
    				Carte.getInstance().getAccompagnement().get(numAccompagnement - 1),
                    Carte.getInstance().getBoisson().get(numBoisson - 1),
                    numClient));
    		numCommande++;
            System.out.println("Votre numéro de commande est le : " + numCommande);

        } catch (IOException ex) {
        	System.out.println();        }
    }

    public void afficherCommande() {
        System.out.println(controlCommander.toString());
    }
}
