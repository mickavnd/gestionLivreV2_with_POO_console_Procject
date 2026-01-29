package Classe;

public class Professeur extends Membre {
	
	private int carteProfesseur;
	private int nbLivreAutorise = 5;
	
	public Professeur(int id, String nom,int carteProffesseur) {
		super(id, nom);
		this.carteProfesseur =carteProfesseur;
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void emprunterLivre(Book livre) {
		// TODO Auto-generated method stub
		
		if(getListEmprunts().size()<nbLivreAutorise) {
			if (livre.isDisponible()) {
			
			livre.emprunter();	
			getListEmprunts().add(livre);
			
		}
			
		}else {
			System.out.println("vous avez depasser le nombre de Livre emprunter autorise qui est"+nbLivreAutorise);
		}
		
	}
	


}
