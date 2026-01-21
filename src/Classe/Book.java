package Classe;

public class Book {
	
	//variable
		
	 private String titre;
	 private String auteur;
	 private String maisonEdition;
	 private int NBpages;
	 private int isbn;
	 private int Nbexamplaire;
	 
	 
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
	
	public Book  createBook(String title,String auteur,String maisonEdition,int NbPage) {
		
		Book book = new Book(title,auteur,maisonEdition,NbPage);		
		
		return book;
		}
		

	
	//getter et setter


	public  int getNBpages() {
		return NBpages;
	}


	public  void setNBpages(int nBpages) {
		NBpages = nBpages;
	}


		
	
	public	 String getMaisonEdition() {
		return maisonEdition;
	}


	public void setMaisonEdition(String maisonEdition) {
		this.maisonEdition = maisonEdition;
	}


	 public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	public String getTitre() {
		return titre;
	}


	 public void setTitre(String titre) {
		this.titre = titre;
	}
	 
	 public int getNbexamplaire() {
			return Nbexamplaire;
		}

		public void setNbexamplaire(int nbexamplaire) {
			Nbexamplaire = nbexamplaire;
		}
	

}
