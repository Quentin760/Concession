package controllers;

 
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import validator.AuthentificationControllerValidator;
import personne.Utilisateur;
import repositories.UtilisateurRepository;


@Controller
public class AuthentificationController {
	
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	
	
	@GetMapping("login")
	public String login(Model model) {
		model.addAttribute("user", new Utilisateur());
		return "login";
	}
	
	@PostMapping("login")
	@ResponseBody
	public ResponseEntity<Utilisateur> loginOk(@Valid @ModelAttribute("user") Utilisateur utilisateur, HttpServletRequest request) {
		List<Utilisateur> results = utilisateurRepository.findByLoginAndPassword(utilisateur.getLogin(), utilisateur.getPassword());
		if (results.size()!=1) {
			return new ResponseEntity<Utilisateur>( HttpStatus.NOT_FOUND);
			
		} else {
			System.out.println(results);
			
			request.getSession().setAttribute("connecteduser", results.get(0));
			
			return new ResponseEntity <Utilisateur>(HttpStatus.OK);
				}
		
	}
	
	@GetMapping("/login/add")
	public String addUtilisateurGet(Model model) {
		model.addAttribute("newUser", new Utilisateur());
		return "login/add";
	}

//	@PostMapping("/login/add")
//	public ResponseEntity<Utilisateur> addUtilisateurPost(@Valid @ModelAttribute("newUser") Utilisateur utilisateur) {
//		if (br.hasErrors()) {
//			System.out.println("Error");
//			return "login/add";
//		} else
//			System.out.println(utilisateur);
//		return new ResponseEntity<Utilisateur>(this.utilisateurRepository.save(utilisateur), HttpStatus.OK);
//	}
	
	@GetMapping("logout")
	public String logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:/vehicules";
	}
	

}
