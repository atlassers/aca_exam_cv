package it.euris.exam.cinema.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.euris.exam.cinema.data.dto.BigliettoDto;
import it.euris.exam.cinema.exception.IdMustBeNullException;
import it.euris.exam.cinema.repository.BigliettoRepository;
import it.euris.exam.cinema.repository.SpettatoreRepository;
import it.euris.exam.cinema.service.BigliettoService;

@Service
public class BigliettoServiceImpl implements BigliettoService{

  @Autowired
  BigliettoRepository bigliettoRepository;
  
  @Autowired
  SpettatoreRepository spettatoreRepository;

  @Override
  public BigliettoDto add(BigliettoDto bigliettoDto) {
    
    if (bigliettoDto.getId() != null) {
      throw new IdMustBeNullException();
    }
    return bigliettoRepository.save(bigliettoDto.toModel()).toDto();
  }
  //inserire metodi di sconto in metodo add
  
  @Override
  public BigliettoDto get(Long id) {
    // TODO Auto-generated method stub
    return null;
  }
}
