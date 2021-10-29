package it.euris.exam.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.euris.exam.cinema.data.model.Biglietto;

public interface BigliettoRepository extends JpaRepository<Biglietto, Long>{

}
