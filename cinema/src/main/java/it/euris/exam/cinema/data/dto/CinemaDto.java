package it.euris.exam.cinema.data.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import it.euris.exam.cinema.data.archetype.Dto;
import it.euris.exam.cinema.data.model.Cinema;
import it.euris.exam.cinema.data.model.SalaCinematografica;
import it.euris.exam.cinema.utils.UT;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CinemaDto implements Dto{
  
  private String id;
  private String incassiTotali;
  
  @JsonIgnore
  private List<SalaCinematografica> sala;
  
  @Override
  public Cinema toModel() {
    return Cinema.builder().id(UT.toLong(id)).incassiTotali(UT.toLong(incassiTotali)).build();
  }

}
