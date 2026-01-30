package Classe;

public class Book {
	
	//variable
		
	 private String titre;
	 private String auteur;
	 private int isbn;
	 private boolean disponible; 
	 
	 
	 //constructeurs
	public Book() {
		 
	 }
	 
	public Book(String titre,String auteur ,int isbn,boolean disponible) {
		
		this.titre =titre;
		this.auteur =auteur;
		this.isbn = isbn;
		this.disponible = disponible;
		
	}
	
	//methode
	
	public String afficherinfos () {
		return this.getTitre() +this.getAuteur()+this.getIsbn()+this.isDisponible();
	}
	
	public void emprunter() {
		
		if (isDisponible()) {
			
		System.out.println("vous avez emprunter le livre" + this.titre);
		this.setDisponible(false);
		}else {
			System.out.println("le livre nest pas disponible");
		}
		
	}
	
	public void retourner() {
		
		this.setDisponible(true);
		System.out.println("vous avez retourne le livre"+ this.titre);
		
	}
	
		
	
	
	

	
	//getter et setter



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

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	 
	
}
