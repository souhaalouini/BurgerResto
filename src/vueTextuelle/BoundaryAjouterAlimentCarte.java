package vueTextuelle;

import control.ControlAjouterAlimentCarte;
import model.Accompagnement;
import model.Boisson;
import model.Hamburger;

public class BoundaryAjouterAlimentCarte {
	private ControlAjouterAlimentCarte controlAjouterAlimentCarte = new ControlAjouterAlimentCarte();

	private Clavier clavier = new Clavier();   
	
	public void ajouterAlimentCarte() {
		boolean entreeValide = false;
		int choix = 0;
		do {
			System.out.println("1. ajouter un hamburger");
			System.out.println("2. ajouter un accompagnement");
			System.out.println("3. ajouter une boisson");
			choix = clavier.entrerClavierInt();
			entreeValide = (choix == 1 || choix == 2 || choix == 3);
			if (!entreeValide)
				System.out.println("Veuillez entrer 1, 2 ou 3");
		} while(!entreeValide);
		System.out.println("Veuillez entrer le nom de l'aliment : ");
		String nom = clavier.entrerClavierString();

		switch (choix) {
			case 1 :
				controlAjouterAlimentCarte.ajouterAliment(Hamburger.nom);
				break;
			case 2 :
				controlAjouterAlimentCarte.ajouterAliment(Boisson.nom);
				break;
			case 3 :
				controlAjouterAlimentCarte.ajouterAliment(Accompagnement.nom);
				break;
			default :
				System.out.println();
		}
	}
}
