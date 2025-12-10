package exo3;

public class PayPal implements Paiement {

	private final double frais_fixes = 0.25;
	
	
	@Override
	public double payer(double montant) {
		double montantTVA = appliquer(montant);
		return montantTVA +montant + frais_fixes;
	}
}
