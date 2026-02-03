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
	 static Bilbliotheque library = new Bilbliotheque();
	 
	public static void main(String[] args) {
		
		/*Membre user = new Etudiant("vende", 1, 3);
		Membre user2 = new Etudiant("cagape", 1, 3);
		
		Book livre = new Book("nartuo","micka",1,true);
		
		library.emprunteLivre(user, livre);*/
		
	
		
		
		while(true) {
			System.out.println("============Menu============");
		System.out.println("bienvenue sur ta gestion de livre");
		 System.out.println("""
		 		 -tape 1 pour cree un compte
		 		 -tape 2 pour  voir les livre disponible
		 		 -tape 3 : ajout livre dans la bibliothque
		 		 tape 4 : emprunter un livre 
		 		 tape 5 : retourner un livre
		 		 tape 6 : pour voir vos livre emprunter
		 		 tap 7 : pour voir la list  des membre (password)
		 		""");
		 
		 // le nextint permet  ne pas faire de boucle infini car lexcution est pas terminé
		 
		 int userchoise = sc.nextInt();
		 
		 switch(userchoise) {
		 	
		 case 1 : {System.out.println("vous etudiant ou professeur");
		 			String choix =sc.next();	
		 			library.AjouterMembre(choix);
				break;}
		 case 2 : {System.out.println("voici les livre disponible");
		 			library.afficheCatalogue();
		 			break;
		 
		 }
		 case 3 : {System.out.println("ajouter un livre ?");
		 		library.AjoutLivre();
		 		break;
		 }
		 case 4 : {System.out.println("qui  et vous  ?");
		 			for(int i= 0 ;i<library.getListMembre().size();i++) {
		 				//get() return the index			
		 				System.out.println(i +"-"+library.getListMembre().get(i).getNom());
		 				
		 			}
		 			int choixMembre = sc.nextInt();
		 			Membre user = library.getListMembre().get(choixMembre);
		 			
		 			System.out.println("quelle livre voulez vous emprunté ?");
		 			for(int i= 0 ;i<library.getListLivre().size();i++) {
 						
		 				//important to know that 
		 				System.out.println(i +"-"+library.getListLivre().get(i).getTitre()+1);
		 				
		 			}
		 			int choixLivre = sc.nextInt();
		 			Book choiceLivre = library.getListLivre().get(choixLivre);
		 			
		 			 
		 			 library.emprunteLivre(user, choiceLivre);
		 			break;			
			 
		 }
			 
		 default: System.out.printf("votre choix ne correspond pas ");
		 			break;
		 			
		 
		 }
		


		}
	
	}
	
	}

