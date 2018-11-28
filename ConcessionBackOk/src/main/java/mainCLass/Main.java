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

import repositories.UtilisateurRepository;
import repositories.VehiculeRepository;
import véhicule.Couleur;
import véhicule.TypeMoteur;
import véhicule.Vehicule;




public class Main {
    public static void main(String[] args) {
		
    	ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConf.class);
		VehiculeRepository vehiculeRepository = (VehiculeRepository) context.getBean(VehiculeRepository.class);
		Vehicule v = new Vehicule();
		v.setAnnée(2011);
		v.setCouleur(Couleur.Blanc);
		v.setMoteur(TypeMoteur.DIESEL);
		v.setPrixTotal(20000.0);
		v.setNom("Scenic");
		
		vehiculeRepository.save(v);
	
		
    }
}