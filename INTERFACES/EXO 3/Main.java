package exo3;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez entrer un montant: ");
		double montant = sc.nextDouble();
		
		Paiement cb = new CarteBancaire();
		Paiement paypal = new PayPal();
		
		System.out.println("Paiement par carte bancaire: " + cb.payer(montant));
		System.out.println("Paiement par paypal : " + paypal.payer(montant));
		
		
	}
}
