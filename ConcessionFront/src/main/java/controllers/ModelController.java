package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import personne.Utilisateur;
import repositories.ModelRepository;


@Controller
public class ModelController {

	@Autowired
	public ModelRepository modelRepository;
	
	@GetMapping("/models")
	public String getVehiculeGetAll (Model model) {
		model.addAttribute("models", modelRepository.findAll());
		model.addAttribute("user", new Utilisateur());
		model.addAttribute("newUser", new Utilisateur());
		return "models";
	}
}
