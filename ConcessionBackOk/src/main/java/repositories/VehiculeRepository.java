package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import véhicule.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Integer>{

	List<Vehicule> findByValider(boolean valider);
}
