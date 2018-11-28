package véhicule;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Model {
	@Id
	@GeneratedValue
	protected int id;
	
	//Attributs Model******************************************************************
	
	@Column
	protected String nom;
	
	@Column
	protected Double prixDeBase;
	
	@Enumerated(EnumType.STRING)
	@Column
	protected Marque nomMarque;
	
	@ElementCollection
	@Enumerated(EnumType.STRING)
	@Column
	protected Set<TypeMoteur> moteursDispo;
	
	@ElementCollection
	@Enumerated(EnumType.STRING)
	@Column
	protected Set<Couleur> couleursDispo;
	
	@ElementCollection
	@Enumerated(EnumType.STRING)
	@Column
	protected Set<Options> optionsDispo;
	
	@ElementCollection
	@Enumerated(EnumType.STRING)
	@Column
	protected Set<Marque> marquesDispo;

	
	
	//Getter Setter********************************************************************
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

	public Double getPrixDeBase() {
		return prixDeBase;
	}

	public void setPrixDeBase(Double prixDeBase) {
		this.prixDeBase = prixDeBase;
	}

	public Marque getNomMarque() {
		return nomMarque;
	}

	public void setNomMarque(Marque nomMarque) {
		this.nomMarque = nomMarque;
	}

	public Set<TypeMoteur> getMoteursDispo() {
		return moteursDispo;
	}

	public void setMoteursDispo(Set<TypeMoteur> moteurDispo) {
		this.moteursDispo = moteurDispo;
	}

	public Set<Couleur> getCouleursDispo() {
		return couleursDispo;
	}

	public void setCouleursDispo(Set<Couleur> couleurDispo) {
		this.couleursDispo = couleurDispo;
	}

	public Set<Options> getOptionsDispo() {
		return optionsDispo;
	}

	public void setOptionsDispo(Set<Options> optionsDispo) {
		this.optionsDispo = optionsDispo;
	}
	
	
	
}
