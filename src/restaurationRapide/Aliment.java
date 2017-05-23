package restaurationRapide;
// Classe Aliment
public abstract class Aliment {
	protected static String nom;
	// Constructeur de la classe
	public Aliment (String nom) {
		this.nom = nom;
	}
	// Getter sur le nom
	protected String getNom() {
		return this.nom;
	}
	// Redéfinition de la méthode toString()
	@Override
	public String toString() {
		return "Aliment []";
	}
	
	
}
