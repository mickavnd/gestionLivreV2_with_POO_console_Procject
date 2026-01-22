package Service;

import java.util.Collection;

import Classe.Book;

public class bookService  {
	
Book book = new Book();

// voir plus tard comment cree des service .
 

//ajouter un livre

public Book  createBook(String title,String auteur,String maisonEdition,int NbPage) {
	
	book.createBook(title, auteur, maisonEdition, NbPage);		
	
	return book;
	}
	

//afficher le livre

public void displayBook(Book book) {
	
	book.toString();
	
}

//voir comment supprimer  un  livre ??
public void removebook( String  title) {
	
	if(book.equals(title)) {
		book.setTitre("");
		
	}
	
	
	
}
//update  le titre d'un  livre

public void updatetitle(String res){
	
	if(book.equals(res)) {
	
		book.setAuteur(res);
		
	}
	
}


}


