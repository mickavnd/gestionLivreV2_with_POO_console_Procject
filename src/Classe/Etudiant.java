package Classe;

public class Etudiant extends Membre {


	private int carteEtudiant;
	
	
	public Etudiant (String nom,int limiteEmprunt,int carteEtudiant) {
		super(nom,limiteEmprunt);
		this.carteEtudiant = carteEtudiant;
		// TODO Auto-generated constructor stub
	}



	public int getCarteEtudiant() {
		return carteEtudiant;
	}



	
	
}
