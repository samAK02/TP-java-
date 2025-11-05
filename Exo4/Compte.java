package fr.sam.Exo4;

public class Compte {
	
	private String numero;
	private String titulaire;
	private double solde;
	private double tauxInteret;
	
	//constructeur
	Compte(String numero, String titulaire, double tauxInteret){
		this.numero = numero;
		this.titulaire = titulaire;
		this.tauxInteret = tauxInteret;
		this.solde = 0;
	}
	
	//getters 
	public String getNumero() {
		return this.numero;
	}
	public String getTitulaire() {
		return this.titulaire;
	}
	public double getSolde() {
		return this.solde;
	}
	public double getTauxInteret() {
		return tauxInteret;
	}
	
	
	//setters 
	public void setTitulaire(String nouveauTitulaire) {
		 this.titulaire = nouveauTitulaire;
	}
	public void setTauxInteret(double nouveauTaux) {
		if (nouveauTaux <= 1 && nouveauTaux>=0.01) {
			this.tauxInteret = nouveauTaux;
		}else {
			System.out.println("le taux d'intérêt doit être compris entre 0.01 et 1");
		}
	}
	
	//Partie 2
	
	//méthode "deposer"

	public void deposer(double montant) {
		if(montant >= 0) {
			this.solde += montant;
		}else {
			System.out.println("Erreur, Le montant ajouté doit être positif");
		}
	}
	
	//méthode "retirer"
	public void retirer(double montant) {
		if(montant <= 0) {
			System.out.println("Erreur, Le montant ajouté doit être positif");
		}else {
			if(montant > this.solde) {
				System.out.println("Erreur, Vous n'avez pas assez d'argent pour retirer cette somme");
			}else {
				this.solde -= montant;
			}
		}	
	}
	
	//calculer intérêt:
	public void calculerInterets() {
		double interets = solde*tauxInteret;
		deposer(interets);
		System.out.println("Solde avec intérêts est de: "+solde);
	}
	
	//afficherDetails
	public void afficherDetails() {	
		System.out.println("Numero: "+numero);
		System.out.println("Titulaire: "+titulaire);
		System.out.println("Solde: "+solde);
		System.out.println("taux d'intérêt: "+(tauxInteret*100)+"%");		
	}
		
}
