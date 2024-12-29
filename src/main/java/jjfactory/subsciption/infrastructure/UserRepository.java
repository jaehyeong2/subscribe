package jjfactory.subsciption.infrastructure;

import jjfactory.subsciption.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
