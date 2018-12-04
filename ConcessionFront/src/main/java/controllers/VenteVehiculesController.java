package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import personne.Utilisateur;
import véhicule.Vehicule;



@Controller
public class VenteVehiculesController {

	@GetMapping("/venteVehicules")
	public String addAuthorGet(Model model) {
		model.addAttribute("vehicule", new Vehicule());
		model.addAttribute("user", new Utilisateur());
		model.addAttribute("newUser", new Utilisateur());
		return "venteVehicules";
	}
}
