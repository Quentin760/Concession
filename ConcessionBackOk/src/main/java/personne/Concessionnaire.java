package personne;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;




@Entity

public class Concessionnaire extends Personne {
	
	
	@Id
	@GeneratedValue
	private int id;
	
	//Attributs Concessionnaire*****************************************************
	
	@Column
	String login;

	@Column
	String password;
	
		
//	@Column
//	List<Vehicule> Vehicules;
	
	
//	@OneToMany(mappedBy="concessionaire", fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
//	@JoinTable(name="CONCESSIONAIRE_MODEL", 
//	joinColumns= @JoinColumn(name="ouvrage_id"),
//	inverseJoinColumns=@JoinColumn(name="concessionaire_id"))
//	@Column
//	private Set<Model> Models = new HashSet<Model>();
	
	//Constructeur******************************************************************
	
	public Concessionnaire(String pNom, String pPrenom) {
		Nom = pNom;
		Prenom = pPrenom;
	}

	//Getter Setter*****************************************************************
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
//
//	public List<Vehicule> getVehicules() {
//		return Vehicules;
//	}
//
//	public void setVehicules(List<Vehicule> vehicules) {
//		Vehicules = vehicules;
//	}
//
//	public Set<Model> getModels() {
//		return Models;
//	}
//
//	public void setModels(Set<Model> models) {
//		Models = models;
//	}

	
	
	
	
	
}
