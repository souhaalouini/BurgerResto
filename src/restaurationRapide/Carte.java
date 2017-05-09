package restaurationRapide;

import java.util.ArrayList;
import java.util.List;

import model.Accompagnement;
import model.Boisson;
import model.Hamburger;

public class Carte {
	private static Carte LaCarte = null;
	private List<Hamburger> listeHamburger = new ArrayList<> ();
	private List<Boisson> listeBoisson = new ArrayList<> ();
	private List<Accompagnement> listeAccompagnement = new ArrayList<> ();

	public void ajouterAliment(Hamburger hamburger) {
		this.listeHamburger.add(hamburger);
	}

	public void ajouterAliment(Accompagnement accompagnement) {
		this.listeAccompagnement.add(accompagnement);
	}

	public void ajouterAliment(Boisson boisson) {
		this.listeBoisson.add(boisson);
	}
	
	public synchronized static Carte getInstance() {
		if(LaCarte == null) {
			LaCarte = new Carte();
		}
		return LaCarte;
	}
}
