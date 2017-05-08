/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vueTextuelle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import restaurationRapide.ProfilUtilisateur;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author etudiant
 */
public class BoundarySIdentifierClient {

    private control.ControlSIdentifier monControle;

    public BoundarySIdentifierClient(control.ControlSIdentifier monControleIdentifie) {
        this.monControle = monControleIdentifie;
    }

    public void IdentifierClient() {
        try {
            String login, mdp;
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(r);

            System.out.print("Veuillez entrer votre login : ");
            login = br.readLine();
            System.out.print("Veuillez entrer votre mot de passe : ");
            mdp = br.readLine();

            Integer numProfil = this.monControle.sIdentifier(ProfilUtilisateur.CLIENT, login, mdp);
            if (numProfil == -1) {
                System.out.println("\n\n -------|Vous n'êtes pas enregistré\n");
            } else {
                System.out.println("Votre n° de profil est le : " + numProfil.toString());
            }

        } catch (IOException ex) {
            Logger.getLogger(BoundarySIdentifierClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
