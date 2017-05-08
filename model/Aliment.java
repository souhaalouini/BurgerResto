package model;

public abstract class Aliment {
	public static String nom;
	
	public Aliment (String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return this.nom;
	}
}
