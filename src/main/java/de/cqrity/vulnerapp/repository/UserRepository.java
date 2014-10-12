package de.cqrity.vulnerapp.repository;

import de.cqrity.vulnerapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
