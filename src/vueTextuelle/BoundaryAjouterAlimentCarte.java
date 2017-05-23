package vueTextuelle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import control.ControlAjouterAlimentCarte;
import control.ControlVerifierIdentification;
import restaurationRapide.Accompagnement;
import restaurationRapide.Aliment;
import restaurationRapide.AlimentMenu;
import restaurationRapide.Boisson;
import restaurationRapide.Hamburger;
import restaurationRapide.ProfilUtilisateur;
import restaurationRapide.Carte;
// Boundary AjouterAlimentCarte (vue)
public class BoundaryAjouterAlimentCarte {
	
	private ControlVerifierIdentification controlVerifierIdentification;
	private ControlAjouterAlimentCarte controlAjouterAlimentCarte;
	// Controler
	public BoundaryAjouterAlimentCarte(ControlVerifierIdentification controlVerifierIdentification, ControlAjouterAlimentCarte controlAjouterAlimentCarte) {
		this.controlVerifierIdentification = controlVerifierIdentification;
		this.controlAjouterAlimentCarte = controlAjouterAlimentCarte;
	}

	
	public void ajouterAlimentCarte(Integer id) {
		boolean entreeValide;
		
		int choix = 0;
		InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(reader);

		do {
				System.out.println("1. ajouter un hamburger");
				System.out.println("2. ajouter un accompagnement");
				System.out.println("3. ajouter une boisson");
				try {
					choix=new Integer(buffer.readLine());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				entreeValide = (choix == 1 || choix == 2 || choix == 3);
				if (!entreeValide) {
					System.out.println("Veuillez entrer 1, 2 ou 3");
				}		
		} while(!entreeValide);
		
		System.out.println("Veuillez entrer le nom de l'aliment : ");
		
		String nom=null;
		try {
			nom = buffer.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		switch (choix) {
			case 1 :
				controlAjouterAlimentCarte.ajouterAliment(AlimentMenu.HAMBURGER, nom);
				break;
			case 2 :
				controlAjouterAlimentCarte.ajouterAliment(AlimentMenu.ACCOMPAGNEMENT, nom);
				break;
			case 3 :
				controlAjouterAlimentCarte.ajouterAliment(AlimentMenu.BOISSON, nom);
				break;
			default :
				System.out.println();
		}
	}
}
