package vueTextuelle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import control.ControlSIdentifier;
import restaurationRapide.ProfilUtilisateur;

public class BoundarySIdentifierPersonnel {
private ControlSIdentifier controlSIdentifier;
	
	public BoundarySIdentifierPersonnel(ControlSIdentifier controlSIdentifier) {
	        this.controlSIdentifier = controlSIdentifier;
	    }

	    public void identificationPersonnel() {
	        try {
	            String login, mdp;
	            InputStreamReader reader = new InputStreamReader(System.in);
	            BufferedReader bf = new BufferedReader(reader);

	            System.out.print("Veuillez entrer votre login : ");
	            login = bf.readLine();
	            System.out.print("Veuillez entrer votre mot de passe : ");
	            mdp = bf.readLine();

	            Integer numProfil = this.controlSIdentifier.sIdentifier(ProfilUtilisateur.PERSONNEL, login, mdp);
	            if (numProfil == -1) {
	                System.out.println("\n\n -------|Vous n'êtes pas enregistré\n");
	            } else {
	                System.out.println("Votre n° de profil est le : " + numProfil.toString());
	            }

	        } catch (IOException ex) {
	            System.out.print("Identification erronnée");
	        }
	    }

}
