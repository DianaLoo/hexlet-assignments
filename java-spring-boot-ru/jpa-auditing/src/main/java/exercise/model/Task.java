package exercise.model;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

// BEGIN
@Entity
@Table(name = "products")
@EntityListeners(AuditingEntityListener.class)
@Setter
@Getter
@EqualsAndHashCode(of = {"id"})
public class Task {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String title;
    private String description;
    @LastModifiedDate
    @GeneratedValue(strategy = IDENTITY)
    private LocalDate updatedAt;

    @CreatedDate
    @GeneratedValue(strategy = IDENTITY)
    private LocalDate createdAt;
}
// END
