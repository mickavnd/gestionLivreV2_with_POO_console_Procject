package Dto;

import Classe.Book;

public class bookDto  {
	
Book book = new Book();



public Book  createBook(String title,String auteur,String maisonEdition,int NbPage) {
	Book book = new Book(title,auteur,maisonEdition ,NbPage);		
	
	return  book;
}


}
