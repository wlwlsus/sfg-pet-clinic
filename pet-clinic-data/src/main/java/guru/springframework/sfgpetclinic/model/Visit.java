package guru.springframework.sfgpetclinic.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

  @Column(name = "date")
  private LocalDate date;

  @Column(name = "descriptions")
  private String description;

  @ManyToOne
  @JoinColumn(name = "pet_id")
  private Pet pet;

}
