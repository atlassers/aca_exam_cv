package it.euris.exam.cinema.data.model;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import it.euris.exam.cinema.data.archetype.Model;
import it.euris.exam.cinema.data.dto.SpettatoreDto;
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
  
  @Column(name="eta")
  private Long eta;
  
  @Builder.Default
  @Column(name="maggiorenne")
  private Boolean maggiorenne = false; 
  
  @ManyToOne
  @JoinColumn(name="id_sala", referencedColumnName="id")
  private SalaCinematografica salaCinematografica;
  
  @OneToOne
  @JoinColumn(name="id_biglietto", referencedColumnName = "id")
  private Biglietto biglietto;
  
  @Override
  public SpettatoreDto toDto() {
    return SpettatoreDto.builder().id(nome).cognome(cognome).dataDiNascita(UT.fromInstant(dataNascita)).maggiorenne(maggiorenne).age(eta.toString()).build();
  }
}
