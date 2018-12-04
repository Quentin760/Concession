package repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import personne.Utilisateur;


@Repository
public interface UtilisateurRepository extends JpaRepository <Utilisateur, Integer> {

	List<Utilisateur> findByLoginAndPassword(String login, String password);

	Optional<Utilisateur> findByLogin(String login);
}
