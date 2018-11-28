package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import personne.Utilisateur;
import repositories.VehiculeRepository;

@Controller
public class VehiculeController {

	@Autowired
	public VehiculeRepository vehiculeRepository;
	
	@GetMapping("/vehicules")
	public String getVehiculeGetAll (Model model) {
		model.addAttribute("user", new Utilisateur());
		model.addAttribute("newUser", new Utilisateur());
		model.addAttribute("vehicules", vehiculeRepository.findAll());
		return "vehicules";
	}
	
	
}
