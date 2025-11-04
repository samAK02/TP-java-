
public class Monome {
	public float coefficient;
	public int degre;
	
	Monome(float coefficient, int degre ){
		this.coefficient = coefficient;
		this.degre = degre;
	}
	
	Monome(float coefficient){
		this.coefficient = coefficient;
		this.degre = 0;
	}
	
	Monome(){
		coefficient = 0;
		degre=0;
	}
	
	public Monome derivée(Monome m) {
		if (degre ==0) {
			return new Monome(0,0);
		}
		return new Monome( coefficient * degre, degre-1);
		
	}
	
	public float évaluer(float x) {
		return (float) (coefficient * Math.pow(x , degre));
	}
	
	public void afficher() {
		System.out.println(coefficient+"x^"+ degre);
	}

	public Monome produit(Monome m) {
		float coeff = coefficient * m.coefficient;
		int deg = degre + m.degre;
		
		return new Monome(coeff, deg);
	}
	
	public boolean egalite(Monome m) {
		return coefficient == m.coefficient && degre == m.degre;
	}
	
	
	

}
