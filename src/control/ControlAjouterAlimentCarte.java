package control;

import model.Accompagnement;
import model.Boisson;
import model.Carte;
import model.Hamburger;
import restaurationRapide.AlimentMenu;

public class ControlAjouterAlimentCarte {
		
	private Carte carte;
			
		public ControlAjouterAlimentCarte(Carte carte) {
			super();
			carte = Carte.getInstance(); 
		}

		// Carte est le nom de la classe, getInstance est une méthode staticic

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
				break;
			}
		}

}
