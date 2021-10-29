package it.euris.exam.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.euris.exam.cinema.data.model.Cinema;

public interface CinemaRepository extends JpaRepository<Cinema, Long>{

}
