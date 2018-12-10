package mainCLass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
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
import personne.RoleUtilisateur;
import personne.Utilisateur;
import repositories.VoitureNeuveRepository;
import repositories.UtilisateurRepository;
import repositories.VehiculeRepository;
import véhicule.Couleur;
import véhicule.Marque;
import véhicule.Options;
import véhicule.VoitureNeuve;
import véhicule.TypeMoteur;
import véhicule.Vehicule;




public class Main {
    public static void main(String[] args) {
		
    	ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConf.class);
		VoitureNeuveRepository voitureNeuveRepository = (VoitureNeuveRepository) context.getBean(VoitureNeuveRepository.class);
		UtilisateurRepository utilisateurRepository = (UtilisateurRepository) context.getBean(UtilisateurRepository.class);
		
		
		
		VoitureNeuve v = new VoitureNeuve();
		v.setNom("Megane");
		v.setCouleursDispo(new HashSet<Couleur>(Arrays.asList(Couleur.values())));
		v.setNomMarque(Marque.Renault);
		v.setMoteursDispo(new HashSet<TypeMoteur>(Arrays.asList(TypeMoteur.values())));
		v.setPrixDeBase(13000.0);
		v.setOptionsDispo(new HashSet<Options>(Arrays.asList(Options.values())));
		
		
		voitureNeuveRepository.save(v);
		
		
		
    }
}