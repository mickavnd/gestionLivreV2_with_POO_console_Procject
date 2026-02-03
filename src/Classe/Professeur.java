package Classe;

public class Professeur extends Membre {
	
	private int carteProfesseur;
	
	public Professeur( String nom,int limiteEmprunts, int carteProffesseur) {
		super( nom,limiteEmprunts );
		this.carteProfesseur =carteProffesseur;
		// TODO Auto-generated constructor stub
	}

	

}
