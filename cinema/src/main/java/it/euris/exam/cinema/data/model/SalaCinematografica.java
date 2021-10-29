package it.euris.exam.cinema.data.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name="sala_cinematografica")
public class SalaCinematografica {

  @Id
  @Column(name="id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name="cinema_id", nullable=false)
  private Cinema cinema;

  @Column(name="posti_totali")
  private Long N_POSTI;

  @OneToMany(mappedBy="salaCinematografica")
  private List<Spettatore> spettatori; 
  
  @OneToOne
  @JoinColumn(name="id_film", referencedColumnName = "id")
  private Film film; 
}
