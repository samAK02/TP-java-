package exo3;

public class CarteBancaire implements Paiement{
	
	private final double commission = 1.5;
	
	
	
	@Override
	public double payer(double montant) {
		double montantTVA = appliquer(montant);
		return montant + montantTVA + commission;
	}
}
