package it.euris.exam.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.euris.exam.cinema.data.dto.BigliettoDto;
import it.euris.exam.cinema.service.BigliettoService;

@RestController
@RequestMapping("/biglietti")
public class BigliettoController {
  
  @Autowired
  BigliettoService bigliettoService;

  @GetMapping("/v1/{id}")
  public BigliettoDto getById(@PathVariable("id") Long id) {
    return bigliettoService.get(id);
   }

  @PostMapping("/v1")
  public BigliettoDto insert(@RequestBody BigliettoDto bigliettoDto) {

      return bigliettoService.add(bigliettoDto);
    }
}

//  @GetMapping("/v1")
//  public List<BigliettoDto> getAll(){
//    return bigliettoService.getAll();
//  }


//  @DeleteMapping("/v1/{id}") 
//  public Boolean delete(@PathVariable("id") Long id) {
//      return bigliettoService.delete(id);
//  }


