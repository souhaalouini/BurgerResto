package control;

import model.Carte;
import restaurationRapide.BDClient;
import restaurationRapide.BDCommande;

public class ControlCommander {
	private Carte laCarte;
    private BDClient laBDClient;
    private BDCommande laBDCommande;

    public ControlCommander(Carte carte, BDClient bdClient, BDCommande bdCommande) {
        this.laCarte = carte;
        this.laBDClient = bdClient;
        this.laBDCommande = bdCommande;
    }



}
