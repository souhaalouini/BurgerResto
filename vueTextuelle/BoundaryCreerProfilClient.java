/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vueTextuelle;

import control.ControlCreerProfil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import restaurationRapide.ProfilUtilisateur;

/**
 *
 * @author maxime
 */
public class BoundaryCreerProfilClient {

    private ControlCreerProfil cCreerProfil;

    public BoundaryCreerProfilClient(ControlCreerProfil cCreerProfil) {
        this.cCreerProfil = cCreerProfil;
    }

    public void creerProfilClient() {
        try {
            String nom, prenom, mdp;
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(r);
            
            System.out.print("Veuillez entrer votre nom : ");
            nom = br.readLine();

            System.out.print("Veuillez entrer votre prenom : ");
            prenom = br.readLine();
            
            System.out.print("Veuillez entrer votre mot de passe : ");
            mdp = br.readLine();
            
            cCreerProfil.creerProfil(ProfilUtilisateur.CLIENT, nom, prenom, mdp);

        } catch (IOException ex) {
            Logger.getLogger(BoundaryCreerProfilGerant.class.getName()).log(Level.SEVERE, "Unable to ReadLine", ex);
        }
        
    }
}
