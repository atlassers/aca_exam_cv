package it.euris.exam.cinema.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.euris.exam.cinema.repository.FilmRepository;
import it.euris.exam.cinema.service.FilmService;

@Service
public class FilmServiceImpl implements FilmService{

  @Autowired
  FilmRepository filmRepository;
}
