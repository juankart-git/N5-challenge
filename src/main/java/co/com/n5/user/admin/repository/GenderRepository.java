package co.com.n5.user.admin.repository;

import co.com.n5.user.admin.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepository extends JpaRepository<Gender, Long> {
}
