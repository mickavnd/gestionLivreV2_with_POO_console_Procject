package Classe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bilbliotheque {
	private List<Book> listLivre;
	private List<Membre> listMembre;
	
	public Bilbliotheque() {
		this.listLivre =new ArrayList<Book>();
		this.listMembre =new ArrayList<Membre>();
	}

	public List<Book> getListLivre() {
		return listLivre;
	}

	public void setListLivre(List<Book> listLivre) {
		this.listLivre = listLivre;
	}

	public List<Membre> getListMembre() {
		return listMembre;
	}

	public void setListMembre(List<Membre> listMembre) {
		this.listMembre = listMembre;
	}
	
	public void AfficheMembre() {
		 
	for(Membre lst : listMembre) {
		System.out.print(lst.getId());
		System.out.println(lst.getNom());
		
		System.out.println("=========================");
	}
	
	}

	public  void AjouterMembre(String choix) {
		Scanner sc = new Scanner(System.in);
		
			//its better too use contains than  ==
			if(choix.contains("etudiant")) {
			
			System.out.println("votre nom ?");
			
			String nom = sc.next();
			Etudiant etudiant = new Etudiant(nom,1);
			listMembre.add(etudiant);		
		}else if(choix =="professeur") {
		
			System.out.println("votre nom ?");
			
			String nom = sc.next();
			Professeur prof = new Professeur(nom,1);
			listMembre.add(prof);	
			
		}else {
			System.out.println("je ne comprend pas votre choix");
		}
		
	}
	
	public  void AjoutLivreLibrary(Book livre) {
		
		if(!listLivre.contains(livre)) {
			listLivre.add(livre);
		}else {
		System.out.println(" le livre est deja ajouté");
	}
}
	
	public  void AjoutLivre() {
		Scanner  sc = new Scanner(System.in);
		System.out.println("combien de livre veut tu ajouter ?");
		int compteur = sc.nextInt();
		
		for (int i =0 ; i <compteur ;i++) {
				System.out.println("titre du livre");
		String titre = sc.next();
		System.out.println("auteur du livre ?");
		String auteur  = sc.next();
		System.out.println("isbn du livre ?");
		int isbn =sc.nextInt();
		boolean isdispo = true;	
		Book livre = new Book(titre,auteur,isbn,isdispo);
		
		AjoutLivreLibrary(livre);
		}
		
	
		
	
}
	public  void  afficheCatalogue() {
		Scanner sc = new Scanner(System.in);
		if(listLivre.isEmpty()) {
			System.out.println(" le catalogue  est vide");
			AjoutLivre();
			
		}else {
			for(Book lst : listLivre) {
			
			System.out.println(lst.afficherinfos());
		}
		}
		

	
	}
	
}
