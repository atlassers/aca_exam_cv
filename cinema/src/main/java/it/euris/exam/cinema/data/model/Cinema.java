package it.euris.exam.cinema.data.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import it.euris.exam.cinema.data.archetype.Model;
import it.euris.exam.cinema.data.dto.CinemaDto;
import it.euris.exam.cinema.utils.UT;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name="cinema")
public class Cinema implements Model{

  @Id
  @Column(name="id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column(name="incassi_totali")
  private Long incassiTotali;
  
  @JsonIgnore
  @OneToMany(mappedBy="cinema")
  private List<SalaCinematografica> saleCinematografiche;
  
  @Override
  public CinemaDto toDto() {
    List<SalaCinematografica> collect = new ArrayList<SalaCinematografica>();
    return CinemaDto.builder()
        .id(UT.numberToString(id)).incassiTotali(UT.numberToString(incassiTotali)).sale(collect)
        .build();
  }

}
