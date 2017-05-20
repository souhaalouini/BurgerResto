package vueTextuelle;

import restaurationRapide.Profil;
import restaurationRapide.ProfilUtilisateur;
import restaurationRapide.Profil.TypeProfil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.sun.glass.ui.Window.Level;

import control.ControlCreerProfil;

public class BoundaryCreerProfilGerant {
	private ControlCreerProfil creerProfil;

    public BoundaryCreerProfilGerant(ControlCreerProfil creerProfil) {
        this.creerProfil = creerProfil;
    }

    public void creerProfilGerant() {
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
            
            creerProfil.creerProfil(ProfilUtilisateur.GERANT, nom, prenom, mdp);

        } catch (IOException ex) {
            System.out.println("Erreur de connexion");
        }
        
    }
}
