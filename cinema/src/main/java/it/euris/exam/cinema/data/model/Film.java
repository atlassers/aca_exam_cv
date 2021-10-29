package it.euris.exam.cinema.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import it.euris.exam.cinema.data.archetype.Dto;
import it.euris.exam.cinema.data.archetype.Model;
import it.euris.exam.cinema.enums.Genere;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name="film")
public class Film implements Model{

  @Id
  @Column(name="id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
   
  @Column(name="autore")
  private String autore;
  
  @Column(name="produttore")
  private String produttore;
  
  @Column(name="genere")
  private Genere genere;
  
  @Column(name="eta_minima")
  private Long eta;
  
  @ManyToOne
  @JoinColumn(name="sala_id", nullable=false)
  private SalaCinematografica salaCinematografica;
  
  @Override
  public Dto toDto() {
    // TODO Auto-generated method stub
    return null;
  }
}
