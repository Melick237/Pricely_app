package de.thb.pricely.repository;
/*
 * Repository: User
 * Chin-Wen,Kao
 * 18.01.2022
 * Reference: Example Repository Spring Boot Project JustNoteIt from Ilonka Wolpert M.Sc. / Dipl-Inf (FH) Stefan Pratsch M.Sc.
 * */

import de.thb.pricely.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import java.util.Optional;

@RepositoryDefinition(domainClass = User.class, idClass = Long.class)
public interface UserRepository extends CrudRepository<User, Long> {
	Optional<User> findByEmail(String email);
}
