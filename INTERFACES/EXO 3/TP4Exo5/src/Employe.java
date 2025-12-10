
public abstract class Employe implements Payable {
	protected String nom;
    protected int age;

    public Employe(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    
    public abstract void afficherInfos();

}
