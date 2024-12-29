package jjfactory.subsciption.infrastructure;

import jjfactory.subsciption.domain.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscribeRepository extends JpaRepository<Subscription, Long> {
}
