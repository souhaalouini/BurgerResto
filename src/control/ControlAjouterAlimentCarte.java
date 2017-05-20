package control;

import restaurationRapide.Accompagnement;
import restaurationRapide.Boisson;
import restaurationRapide.Carte;
import restaurationRapide.Hamburger;
import restaurationRapide.AlimentMenu;

public class ControlAjouterAlimentCarte {
		
	private Carte carte;
			
		public ControlAjouterAlimentCarte(Carte carte) {
			super();
			this.carte = Carte.getInstance(); 
			//this.carte = carte;
		}

		// Carte est le nom de la classe, getInstance est une méthode statique

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
		
		public String visualiserCarte() {
	        return carte.toString();
	    }


}
