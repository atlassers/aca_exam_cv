package it.euris.exam.cinema.data.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import it.euris.exam.cinema.data.archetype.Dto;
import it.euris.exam.cinema.data.model.Cinema;
import it.euris.exam.cinema.data.model.Film;
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
public class SalaCinematograficaDto implements Dto{

  private String id;
  private String cinema_id;
  private String N_POSTI;
  private String idFilm;
  @JsonIgnore
  private List<SpettatoreDto> spettatori;
  
  @Override
  public SalaCinematografica toModel(){
    
    return SalaCinematografica.builder()
        .id(UT.toLong(id))
        .cinema(Cinema.builder().id(UT.toLong(cinema_id)).build())
        .N_POSTI(UT.toLong(N_POSTI))
        .film(Film.builder().id(UT.toLong(idFilm)).build())
        .build();
  }
}
