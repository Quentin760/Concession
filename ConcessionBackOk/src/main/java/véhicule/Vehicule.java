package véhicule;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;



@Entity

public class Vehicule {

	@Id
	@GeneratedValue
	private int id;

	// Attributs Véhicule******************************************************************
	@Column
	protected int prixTotal;
	
	@Column
	protected String nom;
	
	@Column
	protected int année;
	
	@Column
	protected String image;

	@Enumerated(EnumType.STRING)
	@Column
	protected TypeMoteur moteur;

	@ElementCollection
	@Enumerated(EnumType.STRING)
	@Column
	protected List<Options> options = new ArrayList<Options>();

	@Enumerated(EnumType.STRING)
	@Column
	protected Couleur couleur;

	// Constructeur par
	// d�faut*********************************************************
	public Vehicule() {

	}

	// Getter
	// Setter********************************************************************
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	

	public int getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(int prixTotal) {
		this.prixTotal = prixTotal;
	}

	public TypeMoteur getMoteur() {
		return moteur;
	}

	public void setMoteur(TypeMoteur moteur) {
		this.moteur = moteur;
	}

	public List<Options> getOptions() {
		return options;
	}

	public void setOptions(List<Options> options) {
		this.options = options;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	public int getAnnée() {
		return année;
	}

	public void setAnnée(int année) {
		this.année = année;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	// constructeur
//	public Vehicule (double prix,String nom,List<Option> Options,Marque nomMarque) {
//		this.prix = prix;
//		this.nom = nom;
//		this.options = new ArrayList<Option>(Options);
//		this.nomMarque = nomMarque;
//    }

	// getter setter

//	public List<Option> getOptions() {
//		return options;
//	}

//	public void setOptions(List<Option> options) {
//		this.options = options;
//	}
//	public void setNomMarque(Marque nomMarque) {
//		this.nomMarque = nomMarque;
//	}
//	//methode addoption
//	public void addOption(Option opt) {
//		this.options.add(opt);
//	}
//	//Methode prix total
//	public Double getPrixTotal(){
//        Double prixTotalOpt = 0d;
//        Double prixTotal = 0d;
//        for (int i = 0 ; i < options.size(); i++){
//            prixTotalOpt += this.getOptions().get(i).getPrix();
//        }
//        prixTotal = this.moteur.getPrix() + prixTotalOpt;
//        return prixTotal;
//}
//	
//	//methode toString d�claration v�hicule
//	public String toString(){
//        return  "Voiture " + this.getNomMarque() + " : " + this.getNom()
//                + " Moteur " + this.getMoteur().toString()
//                + this.getOptions()
//                + " Prix total : " + (this.getPrixTotal()) + "�";
//}

}