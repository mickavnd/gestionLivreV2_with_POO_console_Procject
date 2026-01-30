package Classe;

public class Etudiant extends Membre {


	private int carteEtudiant;
	
	private int nbLivreAutorise =3;
	
	
	public Etudiant(int id, String nom,int carteEtudiant) {
		super(id, nom);
		this.carteEtudiant = carteEtudiant;
		// TODO Auto-generated constructor stub
	}


	public int getNbLivreEmprunts() {
		return nbLivreAutorise;
	}


	public void setNbLivreEmprunts(int nbLivreEmprunts) {
		nbLivreAutorise = nbLivreEmprunts;
	}


	public int getCarteEtudiant() {
		return carteEtudiant;
	}


	@Override
	public void emprunterLivre(Book livre) {
		
		// TODO Auto-generated method stub
		
		
		if(getListEmprunts().size()<nbLivreAutorise) {
			
			if (livre.isDisponible()) {
			System.out.println("hello world");	
			getListEmprunts().add(livre);
			livre.emprunter();
			
			
			System.out.println("vous avez emprunter le livre" +livre.getTitre());
			
		}else {
			System.out.println("le livre nest pas disponible");
		}
			
		}else {
			System.out.println("vous avez depasser le nombre de Livre emprunter autorise qui est "+nbLivreAutorise);
		}
		
	}
	
	
}
