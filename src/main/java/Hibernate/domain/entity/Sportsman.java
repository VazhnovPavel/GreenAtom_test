package Hibernate.domain.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Getter
@Setter
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "sportsmanCache")
@Entity
@Table(name = "sportsman")
public class Sportsman {
    @Id
    @Column(name = "sportsman_id")
    private long sportsmanId;

    @Column(name = "sportsman_name")
    private String sportsmanName;

}
