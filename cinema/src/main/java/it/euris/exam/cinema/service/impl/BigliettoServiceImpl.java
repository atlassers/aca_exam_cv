package it.euris.exam.cinema.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.euris.exam.cinema.repository.BigliettoRepository;
import it.euris.exam.cinema.service.BigliettoService;

@Service
public class BigliettoServiceImpl implements BigliettoService{

  @Autowired
  BigliettoRepository bigliettoRepository;
}
