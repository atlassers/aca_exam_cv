package it.euris.exam.cinema.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import it.euris.exam.cinema.data.archetype.Model;
import it.euris.exam.cinema.data.dto.BigliettoDto;
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
@Table(name="biglietto")
public class Biglietto implements Model{

  @Id
  @Column(name="id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name="n_posti")
  private Long posti;

  //riduzioni prezzo anziani e bambini;
  @Column(name="prezzo_finale")
  private Long prezzo;

  @OneToOne(mappedBy = "biglietto")
  private Spettatore spettatore;

  @Override
  public BigliettoDto toDto() {
  
    return BigliettoDto.builder()
        .id(UT.numberToString(id)).posti(UT.numberToString(posti)).prezzo(UT.numberToString(prezzo)).build();
  }
}
