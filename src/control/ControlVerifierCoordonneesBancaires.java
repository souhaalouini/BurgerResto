package control;

import restaurationRapide.BDClient;

public class ControlVerifierCoordonneesBancaires {
	BDClient bdClient;
	Integer numCarte;
	String dateCarte;
	
	public ControlVerifierCoordonneesBancaires() {
		this.bdClient = bdClient;
	}
	
	public Boolean verifierCoordonneesBancaires(Integer numCarte, String dateCarte) {
		this.numCarte = numCarte;
		this.dateCarte = dateCarte;
		return true;
	}
}
