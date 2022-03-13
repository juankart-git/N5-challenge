package co.com.n5.user.admin.repository;

import co.com.n5.user.admin.model.AccessByPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessByPersonRepository extends JpaRepository<AccessByPerson, Long> {
}
