package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

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
		model.addAttribute("vehicules", vehiculeRepository.findByValider(true));
		return "vehicules";
	}
	
	@GetMapping("/vehicules/{vehicules.image}")
    public void getFile(
        @PathVariable("vehicules.image") String fileName,
        HttpServletResponse response) {
		
		
        try {
          // get your file as InputStream
          InputStream is = new DataInputStream(new FileInputStream(new File("/Users/dmr/Desktop/Cours JAVA JEE/Apache/apache-tomcat-9.0.12/tmpFiles/"+fileName)));
          // copy it to response's OutputStream
          org.apache.commons.io.IOUtils.copy(is, response.getOutputStream());
          response.flushBuffer();
        } catch (IOException ex) {
          System.out.println("Error writing file to output stream. Filename was '{}'");
          throw new RuntimeException("IOError writing file to output stream");
        }

    }
	
	@GetMapping("/vehicules/supprimer")
	public String supprimerVehiculeGet(@RequestParam("id") int id, Model model) {
		model.addAttribute("user", new Utilisateur());
		model.addAttribute("newUser", new Utilisateur());
		vehiculeRepository.deleteById(id);
		return "redirect:/vehicules";
	}
	
	
}
