package it.euris.exam.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.euris.exam.cinema.data.model.Film;

public interface FilmRepository extends JpaRepository<Film, Long>{
  
}
