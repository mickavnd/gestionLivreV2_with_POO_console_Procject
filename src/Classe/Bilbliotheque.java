package Classe;

import java.util.ArrayList;
import java.util.List;

public class Bilbliotheque {
	private List<Book> listLivre;
	private List<Membre> listMembre;
	
	public Bilbliotheque() {
		this.listLivre =new ArrayList<Book>();
		this.listMembre =new ArrayList<Membre>();
	}

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
	
	public void AfficheMembre() {
		 
	for(Membre lst : listMembre) {
		System.out.println(lst.getNom());
		System.out.println("=========================");
	}
	
	}

}
