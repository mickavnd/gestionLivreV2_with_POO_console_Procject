package controller;

import java.util.ArrayList;
import java.util.Scanner;

import Classe.Book;
import Service.bookService;

public class home  {
	 static bookService bookService;// ne fonctionne pas 
	 static Scanner  sc = new Scanner(System.in);
	 static ArrayList<Book> list = new ArrayList<Book>();
	 //instance a appellr une fois
	 static  Book book = new Book();
	 
	public static void main(String[] args) {
		
		int userchoise ;
		boolean firstboucle =true;
		
		while(firstboucle) {
			System.out.println("=========================");
		System.out.println("bienvenue sur ta gestion de livre");
		 System.out.println("""
		 		 -tape 1 pour cree un compte
		 		 -tape 2 pour  voir les livre disponible
		 		 -tape 3 pour voir ta library 
		 		  tap 4 pour autre 
		 		""");
		 
		 userchoise = sc.nextInt();
		 
		 switch(userchoise) {
		 	
		 case 1 -> firstboucle = displayCreateaccout();
		 case 2 -> firstboucle = displaybookavalide();
		 case 3 -> firstboucle = displayLibery();
		 case 4 -> firstboucle = displaymore();
		 default-> System.out.printf("votre choix ne correspond pas ",firstboucle =false);
		 
		 }
		 	
		
		break;
		
		
		}
		
		
		

		
	}

	private static boolean displaymore() {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean displayLibery() {
		
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
				  
			list.add(book.createBook(title,author,edition,0));
			 	 
		}
		for(Book books : list) {
			System.out.println(books.getTitre());
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

}
