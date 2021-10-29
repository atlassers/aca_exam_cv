package it.euris.exam.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.euris.exam.cinema.data.model.Spettatore;

public interface SpettatoreRepository extends JpaRepository<Spettatore, Long>{

}
