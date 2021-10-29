package it.euris.exam.cinema.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.euris.exam.cinema.data.dto.SpettatoreDto;
import it.euris.exam.cinema.data.model.Spettatore;
import it.euris.exam.cinema.exception.IdMustBeNullException;
import it.euris.exam.cinema.repository.SpettatoreRepository;
import it.euris.exam.cinema.service.SpettatoreService;

@Service
public class SpettatoreServiceImpl implements SpettatoreService{

  @Autowired
  SpettatoreRepository spettatoreRepository;

  @Override
  public List<SpettatoreDto> getAll() {
    return spettatoreRepository.findAll().stream().map(curSpettatore-> curSpettatore.toDto()).collect(Collectors.toList());
  }

  @Override
  public SpettatoreDto get(Long id) {
    Optional<Spettatore> spettatore = spettatoreRepository.findById(id);
    if(spettatore.isPresent()) {
        return spettatore.get().toDto();
    }
    return null;
  }

  @Override
  public SpettatoreDto add(SpettatoreDto spettatoreDto) {
    if(spettatoreDto.getId() != null) {
      throw new IdMustBeNullException();
  }
  return spettatoreRepository.save(spettatoreDto.toModel()).toDto();
}
  
}
