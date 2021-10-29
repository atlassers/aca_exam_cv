package it.euris.exam.cinema.service;

import it.euris.exam.cinema.data.dto.BigliettoDto;

public interface BigliettoService {
  
  public BigliettoDto add(BigliettoDto bigliettoDto);
  
  public BigliettoDto get(Long id);
}
