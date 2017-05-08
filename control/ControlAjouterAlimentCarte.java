package control;

import model.Accompagnement;
import model.Boisson;
import model.Carte;
import model.Hamburger;

public class ControlAjouterAlimentCarte {
		
	private Carte carte;
			
		public ControlAjouterAlimentCarte() {
			super();
			carte = Carte.getInstance(); 
		}

		// Carte est le nom de la classe, getInstance est une méthode staticic

		public void ajouterAliment(String nom) {
			Hamburger hamburger = new Hamburger(nom);
			carte.ajouterAliment(hamburger);
			Accompagnement accompagnement = new Accompagnement(nom);
			carte.ajouterAliment(accompagnement);
			Boisson boisson = new Boisson(nom);
			carte.ajouterAliment(boisson);
		}

}
