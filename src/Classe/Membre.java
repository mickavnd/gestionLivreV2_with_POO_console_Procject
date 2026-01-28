package Classe;

import java.util.ArrayList;
import java.util.List;

public class Membre {
	
	private  int id;
	private String nom;
	private List<Book> ListEmprunts;
	
	
	
  public Membre( int id ,String nom) {
	  
	  this.id = id;
	  this.nom = nom;
	  this.ListEmprunts =new ArrayList<Book>();

	  
  }



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getNom() {
	return nom;
}



public void setNom(String nom) {
	this.nom = nom;
}



public List<Book> getListEmprunts() {
	return ListEmprunts;
}



public void setListEmprunts(List<Book> listEmprunts) {
	ListEmprunts = listEmprunts;
}
  

//methode 

public void emprunterLivre(Book livre) {
	
	if (livre.isDisponible()) {
		
		livre.emprunter();	
		ListEmprunts.add(livre);
		
	}
	
}

public void retournerLivre(Book livre) {
	
	if(ListEmprunts.contains(livre)) {
		livre.retourner();
		ListEmprunts.remove(livre);
		
	}else {
		System.out.println("vous navez pas emprunter se livre ");
	}
	
}


    

}
