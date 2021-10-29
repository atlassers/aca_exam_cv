package it.euris.exam.cinema.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.euris.exam.cinema.data.dto.SalaCinematograficaDto;
import it.euris.exam.cinema.data.model.SalaCinematografica;
import it.euris.exam.cinema.repository.SalaCinematograficaRepository;
import it.euris.exam.cinema.service.SalaCinematograficaService;

@Service
public class SalaCinematograficaServiceImpl implements SalaCinematograficaService{
 @Autowired
 SalaCinematograficaRepository salaCinematograficaRepository;

@Override
public SalaCinematograficaDto add(SalaCinematograficaDto salaCinematograficaDto) {
  return null;
}

@Override
public List<SalaCinematograficaDto> getAll() {
  // TODO Auto-generated method stub
  return null;
}

@Override
public SalaCinematograficaDto get(Long id) {
  // TODO Auto-generated method stub
  return null;
}

@Override
public SalaCinematograficaDto getIncasso(Long id) {
  Optional<SalaCinematografica> sala = salaCinematograficaRepository.findById(id);
  if(sala.isPresent()) {
      
  }
  return null;
}
}
 

//aggiungere metodo in dto per verificare posto in sala.

