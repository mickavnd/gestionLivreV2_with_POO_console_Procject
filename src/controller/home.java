package controller;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Scanner;

import Classe.Bilbliotheque;
import Classe.Book;
import Classe.Etudiant;
import Classe.Membre;
import Classe.Professeur;


public class home  {
			// ne fonctionne pas 
	 static Scanner  sc = new Scanner(System.in);
	 static ArrayList<Book> list = new ArrayList<Book>();
	 //instance a appellr une fois
	 static  Book book = new Book();
	 
	public static void main(String[] args) {
		
		Bilbliotheque liberay = new Bilbliotheque();
		
		Book book2 = new Book();
		Book book3 = new Book();
		Book book4 = new Book();
		 
		Etudiant student  = new Etudiant(1, "vende", 24);
		Professeur prof =  new Professeur(2, "cagape", 1);
		
		liberay.getListMembre().add(student);
		liberay.getListMembre().add(prof);
		
		liberay.AfficheMembre();
		
		
		book.setTitre("naruto");
		book.setDisponible(true);
		
		book2.setTitre("one piece");
		book2.setDisponible(true);
		
		book3.setTitre("bleach");
		book3.setDisponible(true);
		
		book4.setTitre("dbz");
		book4.setDisponible(true);
		
		
		student.emprunterLivre(book);
		
		student.emprunterLivre(book2);
		student.emprunterLivre(book3);
		student.emprunterLivre(book4);
		
		student.retournerLivre(book);  
		
		
		System.out.println("hello world");
		
	}
	/*5	
		while(firstboucle) {
			System.out.println("=========================");
		System.out.println("bienvenue sur ta gestion de livre");
		 System.out.println("""
		 		 -tape 1 pour cree un compte
		 		 -tape 2 pour  voir les livre disponible
		 		 -tape 3 pour voir ta library 
		 		  tap 4 pour autre 
		 		""");
		 
		 // le nextint permet  ne pas faire de boucle infini car lexcution est pas terminé
		 
		 userchoise = sc.nextInt();
		 
		 switch(userchoise) {
		 	
		 case 1 -> firstboucle = displayCreateaccout();
		 case 2 -> firstboucle = displaybookavalide();
		 case 3 -> firstboucle = displayLibery();
		 case 4 -> firstboucle = displaymore();
		 default-> System.out.printf("votre choix ne correspond pas ",firstboucle =true);
		 
		 }
		}
		
	}

	private static boolean displaymore() {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean displayLibery() {
		boolean Liberayboucle = true;
		String userchoice ;
		
		while(Liberayboucle) { 
			
			System.out.println("test");
			
			userchoice= sc.next();
			
			if(userchoice.contains("retour")) {
				break;
			}	
		}
	
		
		return true;
	}

	private static boolean displaybookavalide() {
		// TODO Auto-generated method stub
		for(Book books : list) {
			System.out.println(books.getTitre());
		}
		return false;
	}

	private static boolean displayCreateaccout() {
		// TODO Auto-generated method stub
		return false;
	}

	//crud libery
	
	public static boolean addBook() {
		
		int NBbooks =0;
		// TODO Auto-generated method stub
		System.out.println(" combien de livre un livre?");
		NBbooks =sc.nextInt();
		
		for(int i = 0; i<NBbooks ;i++) {
			System.out.println("ajouter un titre ?");
			String title = sc.next();
			System.out.println("ajouter un auteur ?");
			String author =sc.next();
			System.out.println("maison edition8");
			String edition =sc.next();
				  
		
		}
		for(Book books : list) {
			System.out.println(books.getTitre());
		}
		
		return true;
		
	}
	
	*/
}


