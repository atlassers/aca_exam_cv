package it.euris.exam.cinema.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.euris.exam.cinema.repository.SpettatoreRepository;
import it.euris.exam.cinema.service.SpettatoreService;

@Service
public class SpettatoreServiceImpl implements SpettatoreService{

  @Autowired
  SpettatoreRepository spettatoreRepository;
}
