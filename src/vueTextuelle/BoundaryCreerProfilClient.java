package vueTextuelle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import control.ControlCreerProfil;
import restaurationRapide.ProfilUtilisateur;

public class BoundaryCreerProfilClient {
	private ControlCreerProfil creerProfil;
	
	public BoundaryCreerProfilClient(ControlCreerProfil creerProfil) {
		this.creerProfil = creerProfil;
	}
	
	public void creerProfilClient() {
        try {
            String nom, prenom, mdp;
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(reader);
            
            System.out.print("Veuillez entrer votre nom : ");
            nom = bf.readLine();

            System.out.print("Veuillez entrer votre prenom : ");
            prenom = bf.readLine();
            
            System.out.print("Veuillez entrer votre mot de passe : ");
            mdp = bf.readLine();
            
            creerProfil.creerProfil(ProfilUtilisateur.CLIENT, nom, prenom, mdp);

        } catch (IOException ex) {
            System.out.println("Erreur de connexion");
        }
        
    }
}
