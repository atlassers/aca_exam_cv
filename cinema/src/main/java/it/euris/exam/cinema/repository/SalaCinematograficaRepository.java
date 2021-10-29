package it.euris.exam.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.euris.exam.cinema.data.model.SalaCinematografica;

public interface SalaCinematograficaRepository extends JpaRepository<SalaCinematografica, Long>{

}
