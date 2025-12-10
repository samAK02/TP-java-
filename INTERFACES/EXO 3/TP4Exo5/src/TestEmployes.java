
public class TestEmployes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Payable[] employes = new Payable[2];

	        employes[0] = new EmployeHoraire("Karim", 25, 160, 8.5);
	        employes[1] = new EmployeMensuel("Nadia", 30, 30000);

	        for (Payable p : employes) {

	         ((Employe) p).afficherInfos(); 
	         System.out.println("Salaire : " + p.calculerSalaire() + " DZ");
	           
	        }

	}

}
