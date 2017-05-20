package restaurationRapide;

public abstract class Aliment {
	protected static String nom;
	
	public Aliment (String nom) {
		this.nom = nom;
	}
	
	protected String getNom() {
		return this.nom;
	}

	@Override
	public String toString() {
		return "Aliment []";
	}
	
	
}
