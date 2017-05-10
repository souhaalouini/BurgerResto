package control;

import restaurationRapide.BDClient;

public class ControlEnregistrerCoordonneesBancaires {
	private BDClient bdClient;
	
	public ControlEnregistrerCoordonneesBancaires(BDClient bdClient) {
		this.bdClient = bdClient;
	}
	
	public String visualiserBDClient() {
		return bdClient.toString();
	}
	
	public Boolean enregistrerCoordonneesBancaires(Integer numClient, Integer numCarte, String dateCarte) {
		return bdClient.getClient(numClient).enregistrerCoordonneesBancaires(numCarte, dateCarte);
	}
}
