package personne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Client extends Personne {
	
	
	@Id
	@GeneratedValue
	private int id;
	
	//Attributs Client********************************************************
	@Column
	String login;

	@Column
	String password;
	
	@Column
	String email;
	
	//Constructeur***********************************************************
	
	public Client(String pNom, String pPrenom) {
		Nom = pNom;
		Prenom = pPrenom;
	}

	//Getter Setter************************************************************
	
	public Client() {
		
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}


