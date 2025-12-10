package exo3;

public interface Paiement {
	double TAUX_TVA = 0.19;
	
	public abstract double payer(double montant);
	public default double appliquer(double montant) {
		return montant* (1+TAUX_TVA);
	}
}
