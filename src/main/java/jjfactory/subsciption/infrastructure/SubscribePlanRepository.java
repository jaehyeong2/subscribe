package jjfactory.subsciption.infrastructure;

import jjfactory.subsciption.domain.SubscribePlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscribePlanRepository extends JpaRepository<SubscribePlan, Long> {
}
