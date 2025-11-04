

public class Polynôme {
	public Monome m0;
	public Monome m1;
	public Monome m2;
	
	public Polynôme(Monome m0, Monome m1, Monome m2) {
		this.m0 = m0;
		this.m1 = m1;
		this.m2 = m2;
	}

	public int p_degre(Polynôme p) {
		int max1 = Math.max(p.m0.degre, p.m1.degre);
		int max2 = Math.max(max1, p.m2.degre);
		return max2;
	}
	
	// ajout des méthodes
	
	public boolean p_egalite(Polynôme p) {
		return m0.egalite(p.m0) && m1.egalite(p.m1) && m2.egalite(p.m2);
	}

	public Polynôme p_derivée() {
		Monome dm0 = m0.derivée(m0);
		Monome dm1 = m1.derivée(m1);
		Monome dm2 = m2.derivée(m2);
		return new Polynôme(dm0,dm1,dm2);
	}
	
	public float p_evaluer(float x) {
		return  m0.évaluer(x) + m1.évaluer(x) + m2.évaluer(x);	
	}
	
	public void afficher() {
		System.out.println(m2.coefficient+"x^2"+ m1.coefficient+"x"+m0.coefficient);
	}
	
	

}	

