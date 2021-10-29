package it.euris.exam.cinema.data.model;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import it.euris.exam.cinema.data.archetype.Dto;
import it.euris.exam.cinema.data.archetype.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name="spettatore")
public class Spettatore implements Model{
  
  @Id
  @Column(name="id_spettatore")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column(name="nome")
  private String nome;
  
  @Column(name="cognome")
  private String cognome;
  
  @Column(name="data_nascita")
  private Instant dataNascita;
  
  @Builder.Default
  @Column(name="maggiorenne")
  private Boolean maggiorenne = false; 
  
  @OneToOne
  @JoinColumn(name="id_biglietto", referencedColumnName = "id")
  private Biglietto biglietto;
  
  @Override
  public Dto toDto() {
    // TODO Auto-generated method stub
    return null;
  }

}
