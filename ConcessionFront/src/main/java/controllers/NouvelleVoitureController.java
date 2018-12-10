package controllers;

import java.util.Arrays;
import java.util.HashSet;
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

import véhicule.Couleur;
import véhicule.Marque;
import véhicule.TypeMoteur;
import véhicule.VoitureNeuve;
import personne.Utilisateur;
import repositories.VoitureNeuveRepository;
import repositories.VehiculeRepository;

@Controller
public class NouvelleVoitureController {

private static final Logger logger = LoggerFactory.getLogger(VenteVehiculesController.class);
	
	@Autowired
	VoitureNeuveRepository modelRepository;
	
	@GetMapping("/nouvelleVoiture")
	public String getNouvelleVoiture(Model model) {
		model.addAttribute("user", new Utilisateur());
		model.addAttribute("newUser", new Utilisateur());
		model.addAttribute("model", new VoitureNeuve());
		model.addAttribute("Couleur", new HashSet<Couleur>(Arrays.asList(Couleur.values())));
		model.addAttribute("TypeMoteur", new HashSet<TypeMoteur>(Arrays.asList(TypeMoteur.values())));
		model.addAttribute("Marque", new HashSet<Marque>(Arrays.asList(Marque.values())));
		return "nouvelleVoiture";
	}
	
	@PostMapping("/nouvelleVoiture")
	public String postVoitureNeuve(@ModelAttribute("nouvelleVoiture") VoitureNeuve voitureNeuve, Model model) {
		
//		voitureNeuve.setMoteursDispo(new HashSet<TypeMoteur>(Arrays.asList(TypeMoteur.values())));
		modelRepository.save(voitureNeuve);
		return "redirect:/models";
	}
	
	
	
	
}
