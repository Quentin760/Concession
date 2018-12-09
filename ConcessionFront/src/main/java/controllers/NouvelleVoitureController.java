package controllers;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import véhicule.VoitureNeuve;
import personne.Utilisateur;
import repositories.ModelRepository;
import repositories.VehiculeRepository;

@Controller
public class NouvelleVoitureController {

private static final Logger logger = LoggerFactory.getLogger(VenteVehiculesController.class);
	
	@Autowired
	ModelRepository modelRepository;
	
	@GetMapping("/nouvelleVoiture")
	public String getNouvelleVoiture(Model model) {
		model.addAttribute("user", new Utilisateur());
		model.addAttribute("newUser", new Utilisateur());
		model.addAttribute("model", new VoitureNeuve());
		
		return "nouvelleVoiture";
	}
	
	@PostMapping("/nouvelleVoiture")
	public String postVoitureNeuve(@ModelAttribute("nouvelleVoiture") VoitureNeuve voitureNeuve, Model model) {
		
		modelRepository.save(voitureNeuve);
		return "redirect:/models";
	}
	
	@GetMapping("/nouvelleVoiture/supprimer")
	public String supprimerVehiculeGet(@RequestParam("id") int id, Model model) {
		model.addAttribute("user", new Utilisateur());
		model.addAttribute("newUser", new Utilisateur());
		modelRepository.deleteById(id);
		return "redirect:/models";
	}
	
	
}
