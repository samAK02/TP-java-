package fr.sam.SérieTP2;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Veuillez introduire les informations du premier Polynöme: ");
		
		
		//création du premier Polynôme P1
		System.out.println("coefficient c0 du premier polynôme: ");
		float p1m0c = s.nextFloat();
		Monome M0 = new Monome(p1m0c,0);
		System.out.println("coefficient c1 du premier polynôme: ");
		float p1m1c = s.nextFloat();
		Monome M1 = new Monome(p1m1c,1);
		System.out.println("coefficient c2 du premier polynôme: ");
		float p1m2c = s.nextFloat();
		Monome M2 = new Monome(p1m2c,2);
		
		Polynôme p1 = new Polynôme(M0, M1, M2);
		
		
		//création du premier Polynôme P2
		System.out.println("coefficient c0 du premier polynôme: ");
		float p2m0c = s.nextFloat();
		Monome P2M0 = new Monome(p2m0c,0);
		System.out.println("coefficient c1 du premier polynôme: ");
		float p2m1c = s.nextFloat();
		Monome P2M1 = new Monome(p2m1c,1);
		System.out.println("coefficient c2 du premier polynôme: ");
		float p2m2c = s.nextFloat();
		Monome P2M2 = new Monome(p2m2c,2);
		
		Polynôme p2 = new Polynôme(P2M0, P2M1, P2M2);
		
		
		//comparaison des polynômes
		if (p1.p_egalite(p2)) {
			System.out.println("Vos polynômes sont égaux");
		}else {
			System.out.println("vos Polynömes ne sont pas égaux");
		}
		
		// Calcul de p1(10)
		System.out.println("La valeur du polynôme p1 au point 20 est de: 1"+ p1.p_evaluer(10));
		
		// Calcul de la dérivée de p1 au pt x =20
		p2 = p1.p_derivée();	
		System.out.println("la valeur de la dérivée du polynôme p1 au point 20 est de: "+ p2.p_evaluer(20));
		
	}


}
