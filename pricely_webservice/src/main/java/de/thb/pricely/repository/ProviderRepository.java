package de.thb.pricely.repository;
/*
 * Repository: Provider
 * Chin-Wen,Kao
 * 18.01.2022
 * Reference: Example Repository Spring Boot Project JustNoteIt from Ilonka Wolpert M.Sc. / Dipl-Inf (FH) Stefan Pratsch M.Sc.
 * */

import de.thb.pricely.entity.Provider;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = Provider.class, idClass = Long.class)
public interface ProviderRepository extends CrudRepository<Provider, Long> {
}