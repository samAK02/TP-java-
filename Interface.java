public interface {
  double TAUX_TVA = 0.19;
  public abstract double payer(double montant);
  public default double appliquerTVA(double montant){
    reurn montant * (1 +TAUX_TVA);
  }
}
