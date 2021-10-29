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
  
  public Long getAge(SpettatoreDto spettatoreDto) {
    Long eta = Long.parseLong(spettatoreDto.getAge());
    return eta;
  }
        
  public Double getDiscount(Double prezzo, Long eta) {
    if(eta>70) {
      prezzo=prezzo-(prezzo * 0.01);
    }
    else if(eta<5) {
     prezzo=prezzo/2;
    }
    return prezzo;
  }
  
  @Override
  public Biglietto toModel() {
    return Biglietto.builder().id(UT.toLong(id)).posti(UT.toLong(posti)).prezzo(UT.toLong(prezzo)).spettatore(Spettatore.builder().id(UT.toLong(idSpettatore)).build()).build();
  }
}
