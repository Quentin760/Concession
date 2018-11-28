package validator;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import personne.Utilisateur;

public class AuthentificationControllerValidator implements Validator {
	
	public boolean supports(Class<?> cls) {
		return Utilisateur.class.equals(cls);
	}
	
	public void validate(Object obj, Errors e) 	{
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "login", "login.empty", "Le login doit être saisi");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "password", "password.empty", "Le mot de passe doit être saisi");
	}

}
