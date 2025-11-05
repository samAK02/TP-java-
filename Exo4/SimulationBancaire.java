package fr.sam.Exo4;
import java.util.Scanner;

public class SimulationBancaire {
	public static void main(String[] args) {
		//saisie manuelle
		Scanner s = new Scanner(System.in);
		
		System.out.println("Veuillez entrer le numéro du solde: ");
		String num = s.nextLine();
		
		System.out.println("Veuillez entrer le nom du titulaire: ");
		String titu = s.nextLine();
		
		System.out.println("Veuillez entrer le taux d'intérêt: ");
		double tInteret = s.nextDouble();
		
		
		Compte c1 = new Compte(num, titu, tInteret);
	
	
		c1.afficherDetails();
		c1.deposer(1500);
		c1.retirer(300);
		
		c1.afficherDetails();
		c1.setTauxInteret(0.05);
		c1.setTauxInteret(-1);
		
		
		s.nextLine(); //pour consommer le retour à la ligne
		System.out.println("Veuillez entrer le nom du nouveau titulaire: ");
		String newTitu = s.nextLine();
		c1.setTitulaire(newTitu);
		c1.calculerInterets();
		
		c1.afficherDetails();
		
		s.close();
		
	}

}
