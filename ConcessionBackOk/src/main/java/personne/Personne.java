package personne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Personne {

	@Id
	@GeneratedValue
	private int id;
	
	@Column
	protected String Nom;
	@Column
	protected String Prenom;

	public Personne() {}
	
	public Personne(String pNom, String pPrenom) {
		Nom = pNom;
		Prenom = pPrenom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	
}
