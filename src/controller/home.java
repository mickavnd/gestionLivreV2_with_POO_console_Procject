package controller;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
	 //bonne pratique25
	  static List<Membre>  membre = library.getListMembre();
	 
	public static void main(String[] args) {
		
		/*Todo : -finir le de relier  les fonctionaliter dans  le switch
		 * 		-bien implementer le  switch case
		 * 		-cree un admin 
		 * 		-des acces restrein quand on est pas admin 
		 * 		-voir pour ajouter des donner a la creation  de compte
		 * 		-cree un  un serviceBiblotch
		 * 		 -class auteur
		 * 		- rechercher livre	
		 * 
		 */
		
		while(true) {
			System.out.println("============Menu============");
		System.out.println("bienvenue sur ta gestion de livre");
		 System.out.println("""
		 		 -tape 1 pour cree un compte
		 		 -tape 2 pour  voir les livre disponible
		 		 -tape 3 : ajout livre dans la bibliothque(password)
		 		 tape 4 : emprunter un livre 
		 		 tape 5 : pour voir vos livre emprunter
		 		 tape 6 : retourner un livre
		 		 tap 7 : pour voir la list  des membre (password)
		 		 tape 8 : pour rechercher un livre en particulier
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
		 			
		 			System.out.println("quelle livre voulez vous emprunté (choisire le numero?");
		 			for(int i= 0 ;i<library.getListLivre().size();i++) {
 						
		 				//important to know that 
		 				System.out.println(i +"-"+library.getListLivre().get(i).getTitre());
		 				
		 			}
		 			int choixLivre = sc.nextInt();
		 			Book choiceLivre = library.getListLivre().get(choixLivre);
		 			
		 			 
		 			 library.emprunteLivre(user, choiceLivre);
		 			break;}
		 
		 	
		 case 5 :{ System.out.println("qui ete vous ");
		 	for(int  i=0 ;i<library.getListMembre().size();i++) {
		 		System.out.println(i+"-"+library.getListMembre().get(i).getNom());
		 		System.out.println(i+"-"+library.getListMembre().get(i).getId());		
		 	}
		 	System.out.println("votre numero de membre");
		 	//pas obliger de instancier un classe 
		 	Membre membresactuel = null;
		 	
		 	String idMember = sc.next();
		 	for(Membre m : membre) {
		 		if(m.getId().equals(idMember)) {
		 				membresactuel = m;
		 				
		 			if(membresactuel != null) {
		 				//type book
		 				for(Book bk:membresactuel.getListEmprunts()) {
		 					
		 					System.out.println(bk.getTitre());
		 				}
		 				
		 			}
		 		}	
		 	}
		 	break;
		 }
		 
		 case 8 :{ 
			 System.out.println("quelle livre vouler vous chercher ?");
			 String title = sc.next();
			 library.rechercherUnLivre(title);
			 break;
			 		
		 }
		 
		 	default : {System.out.println(" je ne comprend pas votre choix");
		 				break;}
		 
		 	
		 	
		 }
		


		}
	
	}
	
	}

