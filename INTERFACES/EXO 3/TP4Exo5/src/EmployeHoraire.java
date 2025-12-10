
public class EmployeHoraire extends Employe{
	    private int heuresTravail;
	    private double tauxHoraire;

	    public EmployeHoraire(String nom, int age, int heuresTravail, double tauxHoraire) {
	        super(nom, age);
	        this.heuresTravail = heuresTravail;
	        this.tauxHoraire = tauxHoraire;
	    }

	    @Override
	    public void afficherInfos() {
	        System.out.println("Employé Horaire : " + nom + ", " + age + " ans");
	        System.out.println("Heures travaillées : " + heuresTravail);
	        System.out.println("Taux horaire : " + tauxHoraire + " DZ/h");
	    }

	    @Override
	    public double calculerSalaire() {
	        return heuresTravail * tauxHoraire;
	    }
}
