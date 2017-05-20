package restaurationRapide;

import java.util.ArrayList;
import java.util.List;

public class Carte {
	
	private static Carte LaCarte = null;
	
	private ArrayList<Hamburger> listeHamburger = new ArrayList<> ();
	private ArrayList<Boisson> listeBoisson = new ArrayList<> ();
	private ArrayList<Accompagnement> listeAccompagnement = new ArrayList<> ();
	
	// getters
	public ArrayList<Hamburger> getHamburger() {
		return listeHamburger;
    }
	
	public ArrayList<Accompagnement> getAccompagnement() {
        return listeAccompagnement;
    }
    
	public ArrayList<Boisson> getBoisson() {
		return listeBoisson;
	}
	
	// setters
	public void setListeHamburger(ArrayList<Hamburger> listeHamburger) {
        this.listeHamburger = listeHamburger;
    }
    
	public void setListeAccompagnement(ArrayList<Accompagnement> listeAccompagnement) {
        this.listeAccompagnement = listeAccompagnement;
    }
    
	public void setListeBoisson(ArrayList<Boisson> listeBoisson) {
        this.listeBoisson = listeBoisson;
    }
	
	public void ajouterAliment(Hamburger hamburger) {
		this.listeHamburger.add(hamburger);
	}

	public void ajouterAliment(Accompagnement accompagnement) {
		this.listeAccompagnement.add(accompagnement);
	}

	public void ajouterAliment(Boisson boisson) {
		this.listeBoisson.add(boisson);
	}
	
	// singleton Carte
	public synchronized static Carte getInstance() {
		if(LaCarte == null) {
			LaCarte = new Carte();
		}
		return LaCarte;
	}
	
	public String getListeHamburger() {
        String data = "";
        for (int i = 0; i < this.listeHamburger.size(); i++) {
            data  += "---| " + (i+1) + " : " + listeHamburger.get(i).getNom() + "\n";
        }
        return data;
    }
    
    public String getListeAccompagnement() {
        String data = "";
        for (int i = 0; i < this.listeAccompagnement.size(); i++) {
            data  += "---| " + (i+1) + " : " + listeAccompagnement.get(i).getNom() + "\n";
        }
        return data;
    }
    
    public String getListeBoisson() {
        String data = "";
        for (int i = 0; i < this.listeBoisson.size(); i++) {
            data  += "---| " + (i+1) + " : " + listeBoisson.get(i).getNom() + "\n";
        }
        return data;
    }

	
	// methode toString()
	@Override
	public String toString() {
        String LaCarte = "listeHamburgerr : \n";
        int i;

        for (i = 0; i < listeHamburger.size(); i++) {
            LaCarte = LaCarte + "--| " + listeHamburger.get(i).getNom();
            LaCarte = LaCarte + "\n";
        }

        LaCarte = LaCarte + "listeBoisson : \n";

        for (i = 0; i < listeBoisson.size(); i++) {
            LaCarte = LaCarte + "--| " + listeBoisson.get(i).getNom();
            LaCarte = LaCarte + "\n";
        }

        LaCarte = LaCarte + "listeAccompagnement : \n";

        for (i = 0; i < listeAccompagnement.size(); i++) {
            LaCarte = LaCarte + "--| " + listeAccompagnement.get(i).getNom();
            LaCarte = LaCarte + "\n";
        }
        
        return LaCarte;
    }	
}
