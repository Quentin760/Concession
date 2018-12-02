package mainCLass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.HibernateConf;
import exception.HibernateUsageException;

import personne.Client;
import personne.Utilisateur;
import repositories.ModelRepository;
import repositories.UtilisateurRepository;
import repositories.VehiculeRepository;
import véhicule.Couleur;
import véhicule.Marque;
import véhicule.Model;
import véhicule.TypeMoteur;
import véhicule.Vehicule;




public class Main {
    public static void main(String[] args) {
		
    	ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConf.class);
		VehiculeRepository vehiculeRepository = (VehiculeRepository) context.getBean(VehiculeRepository.class);
		ModelRepository modelRepository = (ModelRepository) context.getBean(ModelRepository.class);
		
		Vehicule v = new Vehicule();
		v.setAnnée(2006);
		v.setCouleur(Couleur.Noir);
		v.setMoteur(TypeMoteur.DIESEL);
		v.setPrixTotal(6000.0);
		v.setNom("207");
		
		vehiculeRepository.save(v);
	
		Vehicule v2 = new Vehicule();
		v2.setAnnée(2006);
		v2.setCouleur(Couleur.Noir);
		v2.setMoteur(TypeMoteur.DIESEL);
		v2.setPrixTotal(6000.0);
		v2.setNom("207");
		
		vehiculeRepository.save(v2);
		
		Vehicule v3 = new Vehicule();
		v3.setAnnée(2006);
		v3.setCouleur(Couleur.Noir);
		v3.setMoteur(TypeMoteur.DIESEL);
		v3.setPrixTotal(6000.0);
		v3.setNom("207");
		
		vehiculeRepository.save(v3);
		
		Model m = new Model();
		m.setNomMarque(Marque.PEUGEOT);
		m.setPrixDeBase(15000.0);
		m.setNom("207");
		
		modelRepository.save(m);
		
		Model m1 = new Model();
		m.setNomMarque(Marque.PEUGEOT);
		m.setPrixDeBase(15000.0);
		m.setNom("207");
		
		modelRepository.save(m1);
		
		Model m2 = new Model();
		m.setNomMarque(Marque.PEUGEOT);
		m.setPrixDeBase(15000.0);
		m.setNom("207");
		
		modelRepository.save(m2);
		
		Model m3 = new Model();
		m.setNomMarque(Marque.PEUGEOT);
		m.setPrixDeBase(15000.0);
		m.setNom("207");
		
		modelRepository.save(m3);
		
		
		
    }
}