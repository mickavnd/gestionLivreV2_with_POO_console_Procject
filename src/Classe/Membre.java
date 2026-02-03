package Classe;

import java.util.ArrayList;
import java.util.List;

public  class  Membre {
	
	private  String id;
	private String nom;
	public int limiteEmprunts;
	private List<Book> ListEmprunts;
	
	
	
  public Membre( String nom,int limiteEmprunts) {
	  
	  this.id = IdGenerate.generateId();
	  this.nom = nom;
	  this.limiteEmprunts = limiteEmprunts;
	  this.ListEmprunts =new ArrayList<Book>();

	  
  }



public String getId() {
	return id;
}



public void setId(String id) {
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
  
public int getLimiteEmprunts() {
	return limiteEmprunts;
}



public void setLimiteEmprunts(int limiteEmprunts) {
	this.limiteEmprunts = limiteEmprunts;
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
