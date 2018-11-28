package personne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import personne.RoleUtilisateur;


@Entity
public class Utilisateur extends Personne {

	//Attributs*************************************************************
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	String login;

	@Column
	String password;
	
	@Enumerated(EnumType.STRING)
	@Column
	RoleUtilisateur role;
	
	//Constructeur**************************************************************************
	
	public Utilisateur () {
		
	}

	
	// Getter Setter*************************************************************************
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

	public RoleUtilisateur getRole() {
		return role;
	}

	public void setRole(RoleUtilisateur role) {
		this.role = role;
	}
	
	
}
