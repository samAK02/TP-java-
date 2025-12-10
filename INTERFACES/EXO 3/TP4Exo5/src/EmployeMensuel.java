
public class EmployeMensuel extends Employe{
	private double salaireFixe;
    private final double tauxPrime = 30; 

    public EmployeMensuel(String nom, int age, double salaireFixe) {
        super(nom, age);
        this.salaireFixe = salaireFixe;
    }

    @Override
    public void afficherInfos() {
        System.out.println("Employé Mensuel : " + nom + ", " + age + " ans");
        System.out.println("Salaire fixe : " + salaireFixe + " DZ");
        System.out.println("Taux de prime : " + tauxPrime + "%");
    }

    @Override
    public double calculerSalaire() {
        return salaireFixe + (salaireFixe * tauxPrime / 100);
    }

}
