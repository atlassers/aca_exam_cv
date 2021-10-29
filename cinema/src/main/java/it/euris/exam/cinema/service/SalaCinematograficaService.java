package it.euris.exam.cinema.service;

import java.util.List;
import it.euris.exam.cinema.data.dto.SalaCinematograficaDto;
public interface SalaCinematograficaService {

  public SalaCinematograficaDto add(SalaCinematograficaDto salaCinematograficaDto);
  
  public List<SalaCinematograficaDto> getAll();

  public SalaCinematograficaDto get(Long id);
  
  public SalaCinematograficaDto getIncasso(Long id);
}
