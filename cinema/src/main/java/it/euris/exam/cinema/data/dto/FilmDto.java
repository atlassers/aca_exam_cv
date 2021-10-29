package it.euris.exam.cinema.data.dto;

import it.euris.exam.cinema.data.archetype.Dto;
import it.euris.exam.cinema.data.model.Film;
import it.euris.exam.cinema.data.model.SalaCinematografica;
import it.euris.exam.cinema.enums.Genere;
import it.euris.exam.cinema.utils.UT;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class FilmDto implements Dto{
  
  private String id;
  private String autore;
  private String produttore;
  private String genere;
  private String eta;
  private String idSala;
  
  @Override
  public Film toModel() {
    return Film.builder().id(UT.toLong(id)).autore(autore).produttore(produttore).genere(Genere.valueOf(genere)).eta(UT.toLong(eta)).salaCinematografica(SalaCinematografica.builder().id(UT.toLong(idSala)).build()).build();
  }
}
