package it.euris.exam.cinema.data.dto;

import it.euris.exam.cinema.data.archetype.Dto;
import it.euris.exam.cinema.data.model.Biglietto;
import it.euris.exam.cinema.data.model.SalaCinematografica;
import it.euris.exam.cinema.data.model.Spettatore;
import it.euris.exam.cinema.utils.UT;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class SpettatoreDto implements Dto{
  private String id;
  private String nome;
  private String cognome;
  private String dataDiNascita;
  private Boolean maggiorenne; 
  private String salaId;
  private String bigliettoId;
  
  @Override
  public Spettatore toModel() {
    return Spettatore.builder().id(UT.toLong(id)).nome(nome).cognome(cognome).dataNascita(UT.toInstant(dataDiNascita)).maggiorenne(maggiorenne).salaCinematografica(SalaCinematografica.builder().id(UT.toLong(salaId)).build()).biglietto(Biglietto.builder().id(UT.toLong(bigliettoId)).build()).build();
  }

}
