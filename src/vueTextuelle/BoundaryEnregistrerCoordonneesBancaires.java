package vueTextuelle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import control.ControlEnregistrerCoordonneesBancaires;
import control.ControlVerifierCoordonneesBancaires;

public class BoundaryEnregistrerCoordonneesBancaires {
	private ControlVerifierCoordonneesBancaires controlVerifierCoordonneesBancaires;
    private ControlEnregistrerCoordonneesBancaires controlEnregistrerCoordonneesBancaires;

    public BoundaryEnregistrerCoordonneesBancaires(ControlVerifierCoordonneesBancaires controlVerifierCoordonneesBancaires, ControlEnregistrerCoordonneesBancaires controlEnregistrerCoordonneesBancaires) {
        this.controlVerifierCoordonneesBancaires = controlVerifierCoordonneesBancaires;
        this.controlEnregistrerCoordonneesBancaires = controlEnregistrerCoordonneesBancaires;
    }

    public boolean renseignerCoordonneesBancaires(Integer numClient) {
        Integer numCarte = 0;
        String dateCarte = "";
        Boolean carteValide = Boolean.TRUE;
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(reader);

        try {

            System.out.println("Veuillez saisir votre numéro de carte bancaire (16 chiffres)");
            numCarte = new Integer(bf.readLine());

            System.out.println("Veuillez saisir la date d'expiration de votre carte bancaire (MMAA)");
            dateCarte = bf.readLine();
            System.out.println(numCarte);

        } catch (IOException ex) {
        	System.out.println("[ERREUR] : Coordonnées bancaires invalides.");
        }

        carteValide = this.controlVerifierCoordonneesBancaires.verifierCoordonneesBancaires(numCarte, dateCarte);

        if (carteValide) {
            carteValide = this.controlEnregistrerCoordonneesBancaires.enregistrerCoordonneesBancaires(numClient, numCarte, dateCarte);
            System.out.println("Enregistrement carte [OK]");
            return true;

        } else {
            System.out.println("Enregistrement carte [ERREUR] : Carte Invalide");
            return false;
        }

    }

}
