package it.euris.exam.cinema.service;

import java.util.List;
import it.euris.exam.cinema.data.dto.SpettatoreDto;

public interface SpettatoreService {
 public List<SpettatoreDto> getAll();
  
  public SpettatoreDto get(Long id);
  
  public SpettatoreDto add(SpettatoreDto nationDto);
}
