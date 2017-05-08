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
public class BoundarySIdentifierPersonnel {

    private control.ControlSIdentifier monControle;

    public BoundarySIdentifierPersonnel(control.ControlSIdentifier monControleIdentifie) {
        this.monControle = monControleIdentifie;
    }

    public void IdentifierPersonnel() {
        try {
            String login, mdp;
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(r);

            System.out.print("Veuillez entrer votre login : ");
            login = br.readLine();
            System.out.print("Veuillez entrer votre mot de passe : ");
            mdp = br.readLine();

            Integer numProfil = this.monControle.sIdentifier(ProfilUtilisateur.PERSONNEL, login, mdp);
            if (numProfil == -1) {
                System.out.println("\n\n -------|Vous ne faites pas partie du personnel !\n");
            } else {
                System.out.println("Vous faites partie du personnel est votre n° est : " + numProfil.toString());
            }

        } catch (IOException ex) {
            Logger.getLogger(BoundarySIdentifierClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
