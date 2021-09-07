package one.digitalinnovation.personapi.repository;

import one.digitalinnovation.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Os repositórios são os responsáveis pelas interações com o banco de dados.
 */

public interface PersonRepository extends JpaRepository<Person, Long> {

}
