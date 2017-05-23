/* Controler : Définition des méthodes du cas AjouterAlimentCarte */

package control;

import restaurationRapide.Accompagnement;
import restaurationRapide.Boisson;
import restaurationRapide.Carte;
import restaurationRapide.Hamburger;
import restaurationRapide.AlimentMenu;
// Control du cas AjouterAlimentCarte
public class ControlAjouterAlimentCarte {
		
	private Carte carte;
		// Constructeur du control
		public ControlAjouterAlimentCarte(Carte carte) {
			super();
			this.carte = Carte.getInstance(); 
			//this.carte = carte;
		}

		// Carte est le nom de la classe, getInstance() est une méthode statique
		
		// Ajouter un aliment à la carte
		public void ajouterAliment(AlimentMenu aliment, String nom) {
			switch(aliment) {
			case HAMBURGER:
				carte.ajouterAliment(new Hamburger(nom));
				break;
				
			case BOISSON:
				carte.ajouterAliment(new Boisson(nom));
				break;
				
			case ACCOMPAGNEMENT:
				carte.ajouterAliment(new Accompagnement(nom));
				break;
				
			default:
				System.out.println("[ ERREUR ] : Type d'aliment inconnu.");
				break;
			}
		}
		// Méthode qui permet de visualiser la carte
		public String visualiserCarte() {
	        return carte.toString();
	    }


}
