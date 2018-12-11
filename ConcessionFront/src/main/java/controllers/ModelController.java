package controllers;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import personne.Utilisateur;
import repositories.VoitureNeuveRepository;
import véhicule.Couleur;
import véhicule.Marque;
import véhicule.Options;
import véhicule.TypeMoteur;


@Controller
public class ModelController {

	@Autowired
	public VoitureNeuveRepository modelRepository;
	
	@GetMapping("/models")
	public String getVehiculeGetAll (Model model) {
		model.addAttribute("models", modelRepository.findAll());
		model.addAttribute("user", new Utilisateur());
		model.addAttribute("newUser", new Utilisateur());
		model.addAttribute("Couleur", new HashSet<Couleur>(Arrays.asList(Couleur.values())));
		model.addAttribute("TypeMoteur", new HashSet<TypeMoteur>(Arrays.asList(TypeMoteur.values())));
		model.addAttribute("Marque", new HashSet<Marque>(Arrays.asList(Marque.values())));
		model.addAttribute("Options", new HashSet<Options>(Arrays.asList(Options.values())));
		return "models";
	}
	
	@GetMapping("/models/supprimer")
	public String supprimerModelGet(@RequestParam("id") int id, Model model) {
		model.addAttribute("user", new Utilisateur());
		model.addAttribute("newUser", new Utilisateur());
		modelRepository.deleteById(id);
		return "redirect:/models";
	}
}
