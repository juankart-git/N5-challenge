package co.com.n5.user.admin.repository;

import co.com.n5.user.admin.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
