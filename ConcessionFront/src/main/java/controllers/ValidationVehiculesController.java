package controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import personne.Utilisateur;
import repositories.VehiculeRepository;
import véhicule.TypeMoteur;
import véhicule.Vehicule;

@Controller
public class ValidationVehiculesController {

private static final Logger logger = LoggerFactory.getLogger(ValidationVehiculesController.class);
	
	@Autowired
	VehiculeRepository vehiculeRepository;
	
	@GetMapping("/vehiculesAValider")
	public String addVehiculeGet(Model model) {

		model.addAttribute("user", new Utilisateur());
		model.addAttribute("newUser", new Utilisateur());
		model.addAttribute("aValider", vehiculeRepository.findByValider(false));
		
		return "vehiculesAValider";
	};
	
	@GetMapping("/vehiculesAValider/valider")
	public String validerVehiculeGet(@RequestParam("id") int id, Model model) {
	
		if(!vehiculeRepository.findById(id).isPresent()) {
			return "vehiculesAValider";
		} 
		Vehicule validerVehicule = vehiculeRepository.findById(id).get();
		
		validerVehicule.setValider(true);
		
		vehiculeRepository.save(validerVehicule);
		model.addAttribute("user", new Utilisateur());
		model.addAttribute("newUser", new Utilisateur());
		return "vehiculesAValider";
	}
	
	@GetMapping("/vehiculesAValider/supprimer")
	public String supprimerVehiculeGet(@RequestParam("id") int id, Model model) {
		model.addAttribute("user", new Utilisateur());
		model.addAttribute("newUser", new Utilisateur());
		vehiculeRepository.deleteById(id);
		return "vehiculesAValider";
	}
}
