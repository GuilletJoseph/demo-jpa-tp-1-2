package entities;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ville")


public class Ville {
	    private int id;	    
	    private String nom;
	    private int codePostal ;   
	    private Date dernierRes;
	    private Categorie categorie;
	
	
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "NOM")
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Column(name = "CODE_POSTAL")
	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	@Column(name = "DERNIER_RES")
	public Date getDernierRes() {
		return dernierRes;
	}

	public void setDernierRes(Date dernierRes) {
		this.dernierRes = dernierRes;
	}
	@Column(name = "CATEGORIE")
	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

    
    
    
    
}
