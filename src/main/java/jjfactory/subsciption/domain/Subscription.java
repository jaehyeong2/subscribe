package jjfactory.subsciption.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Subscription {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long planId;

    private boolean autoRenew;

    @Enumerated(EnumType.STRING)
    private SubscribeStatus status;

    private LocalDate startDate;
    private LocalDate endDate;

    @Builder
    public Subscription(Long userId, Long planId, boolean autoRenew, SubscribeStatus status, LocalDate startDate, LocalDate endDate) {
        this.userId = userId;
        this.planId = planId;
        this.autoRenew = autoRenew;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @CreationTimestamp
    private LocalDateTime createdAt;
}
