package it.euris.exam.cinema.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.euris.exam.cinema.repository.CinemaRepository;
import it.euris.exam.cinema.service.CinemaService;

@Service
public class CinemaServiceImpl implements CinemaService{

  @Autowired
  CinemaRepository cinemaRepository;
}
