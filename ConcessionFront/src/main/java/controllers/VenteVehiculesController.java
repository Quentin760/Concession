package controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import personne.Utilisateur;
import repositories.VehiculeRepository;
import véhicule.Couleur;
import véhicule.TypeMoteur;
import véhicule.Vehicule;



@Controller
public class VenteVehiculesController {
	
private static final Logger logger = LoggerFactory.getLogger(VenteVehiculesController.class);
	
	@Autowired
	VehiculeRepository vehiculeRepository;

	@GetMapping("/venteVehicules")
	public String addAuthorGet(Model model) {
		model.addAttribute("vehicule", new Vehicule());
		model.addAttribute("user", new Utilisateur());
		model.addAttribute("newUser", new Utilisateur());
		model.addAttribute("TypeMoteur", TypeMoteur.values());
		return "venteVehicules";
	}
	
	
	/**
	 * Upload single file using Spring Controller
	 */
	@PostMapping("/venteVehicules")
	public @ResponseBody
	String uploadFileHandler(@RequestParam("name") String name, @RequestParam("prixTotal") int prixTotal, @RequestParam("nom") String nom,
//			@RequestParam("année") int année, 
			@RequestParam("couleur") Couleur couleur, @RequestParam("moteur") TypeMoteur moteur,
			@RequestParam("file") MultipartFile file) {

		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();

				// Creating the directory to store file
				String rootPath = System.getProperty("catalina.home");
				File dir = new File(rootPath + File.separator + "tmpFiles");
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
				File serverFile = new File(dir.getAbsolutePath()
						+ File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();

				logger.info("Server File Location="
						+ serverFile.getAbsolutePath());
				Vehicule v = new Vehicule();
//				v.setAnnée(année);
				v.setCouleur(couleur);
				v.setImage("vehicules/"+name);
				v.setMoteur(moteur);
				v.setNom(nom);
				v.setPrixTotal(prixTotal);
				
				vehiculeRepository.save(v);
				

				return "redirect:/vehicules";
			} catch (Exception e) {
				return "You failed to upload " + name + " => " + e.getMessage();
			}
		} else {
			return "You failed to upload " + name
					+ " because the file was empty.";
		}
	}
}
