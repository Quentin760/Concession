package repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import véhicule.VoitureNeuve;

public interface ModelRepository extends JpaRepository<VoitureNeuve, Integer>{

}
