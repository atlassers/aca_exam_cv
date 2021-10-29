package it.euris.exam.cinema.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.euris.exam.cinema.repository.SalaCinematograficaRepository;
import it.euris.exam.cinema.service.SalaCinematograficaService;

@Service
public class SalaCinematograficaServiceImpl implements SalaCinematograficaService{
 @Autowired
 SalaCinematograficaRepository salaCinematograficaRepository;
 
}
