package Service;

import java.util.Collection;

import Classe.Book;

public class bookService  {
	
Book book = new Book();


//ajouter un livre

public Book  createBook(String title,String auteur,String maisonEdition,int NbPage) {
	Book book = new Book(title,auteur,maisonEdition ,NbPage);		
	
	return  book;
	
}

//afficher le livre

public void displayBook(Book book) {
	
	book.toString();
	
}

//voir comment supprimer  un  livre ??
public void removebook( String  title) {
	
	
	
}
//update un livre


}


