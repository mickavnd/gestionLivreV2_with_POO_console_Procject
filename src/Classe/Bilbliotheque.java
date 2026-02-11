package Classe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Bilbliotheque {
	
	//attribut
	private List<Book> listLivre;
	private List<Membre> listMembre;
	
	//constructeur
	
	public Bilbliotheque() {
		this.listLivre =new ArrayList<Book>();
		this.listMembre =new ArrayList<Membre>();
	}

	
	//getter et setter
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
	
	//methode
	
	public void AfficheMembre() {
		 
	for(Membre lst : listMembre) {
		System.out.print(lst.getId());
		System.out.println(lst.getNom());
		
		System.out.println("=========================");
	}
	
	}

	public  void AjouterMembre(String choix) {
		Scanner sc = new Scanner(System.in);
		Membre nouveauxuser;
		
		//we use Member that we call polymorphisme;
		
			//its better too use contains than  ==
			if(choix.contains("etudiant")) {
			
			System.out.println("votre nom ?");
			
			String nom = sc.next();
			 nouveauxuser  = new Etudiant(nom, 3, 0);
			listMembre.add(nouveauxuser);		
		}else if(choix.contains("professeur")) {
		
			System.out.println("votre nom ?");
			
			String nom = sc.next();
			 nouveauxuser = new Professeur(nom,5,1);
			listMembre.add(nouveauxuser);	
			
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
	
	public void emprunteLivre(Membre user , Book livre) {
		
	
		
		if(livre.isDisponible()) {
			
			if(user.getListEmprunts().size()< user.limiteEmprunts) {
			if (livre.isDisponible()) {
			
			user.getListEmprunts().add(livre);
			livre.emprunter();	
			System.out.println("vous avez emprunter le livre "+ livre.getTitre());
			
			
		}else {
			System.out.println("le livre n'est plus disponible");
		}
			
		}
			
		}else {
			System.out.println("vous avez depasser le nombre de Livre emprunter autorise qui est"+user.getLimiteEmprunts());
		}
		
		
	}
	
	public void retourneLivre(Book livre) {
		
	}
	
	public void rechercherUnLivre(String name) {
		 Scanner sc = new Scanner(System.in);
		 String Motcle = name.toLowerCase();
		 //cree une list  pour  ajouter les livre que tu chercher
		 List<Book> searchlst = new ArrayList<>();
		 
		 for(Book lst : listLivre) {
			 if(lst.getTitre().toLowerCase().contains(Motcle)) {
				 searchlst.add(lst);
			 }
			 
		 }
		 //verifier si  la list est vide 
		 if(searchlst.isEmpty()) {
			 System.out.println("aucun livre trouver");
		 }else {
			 for(Book lst : searchlst) {
			 
			 System.out.println(lst.afficherinfos()); 
		 }
		 }			
			
	}
}
