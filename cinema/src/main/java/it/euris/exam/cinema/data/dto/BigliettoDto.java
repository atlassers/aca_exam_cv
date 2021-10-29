package it.euris.exam.cinema.data.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import it.euris.exam.cinema.data.archetype.Dto;
import it.euris.exam.cinema.data.model.Biglietto;
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

public class BigliettoDto implements Dto{
  
  private String id;
  private String posti;
  private String prezzo;
  @JsonIgnore
  private String idSpettatore;
  
  @Override
  public Biglietto toModel() {
    return Biglietto.builder().id(UT.toLong(id)).posti(UT.toLong(posti)).prezzo(UT.toLong(prezzo)).spettatore(Spettatore.builder().id(UT.toLong(idSpettatore)).build()).build();
  }
}
