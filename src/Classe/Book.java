package Classe;

public class Book {
	
	//variable
		
	 private String titre;
	 private String auteur;
	 private String maisonEdition;
	 private int NBpages;
	 private int isbn;
	 
	 
	 //constructeurs
	 
	 public Book() {
		 
	 }
	 
	public Book(String titre,String auteur ,String maisonEdition,int Nbpages) {
		
		this.setTitre(titre);
		this.setAuteur(auteur);
		this.setMaisonEdition(maisonEdition);
		this.setNBpages(Nbpages);
		
	}
	
	//methode
	
	public String toString() {
		return this.getTitre() +this.getAuteur()+this.getMaisonEdition()+this.getNBpages();
	}
		

	
	//getter et setter


	private int getNBpages() {
		return NBpages;
	}


	private void setNBpages(int nBpages) {
		NBpages = nBpages;
	}


	private String getMaisonEdition() {
		return maisonEdition;
	}


	private void setMaisonEdition(String maisonEdition) {
		this.maisonEdition = maisonEdition;
	}


	private String getAuteur() {
		return auteur;
	}


	private void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	private String getTitre() {
		return titre;
	}


	private void setTitre(String titre) {
		this.titre = titre;
	}
	

}
