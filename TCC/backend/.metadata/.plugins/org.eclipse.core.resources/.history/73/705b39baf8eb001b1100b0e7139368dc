package com.tcc.Satellitechecker.Interface;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tcc.Satellitechecker.domain.SatellitesRepository;
import com.tcc.Satellitechecker.domain.SatellitesService;
import com.tcc.Satellitechecker.domain.Satellites;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/hardware")
@RequiredArgsConstructor
public class SatellitesController {
	private final SatellitesRepository repository;
	
	    @PostMapping
	    @ResponseStatus(HttpStatus.CREATED)
	    public Satellites save(@RequestBody Satellites hardware) {
	    	return repository.save(hardware);
	    }
	    	 
	    @GetMapping
	    public List<Satellites> getAll(){
	    	return repository.findAll();
	    }
	    
	    @GetMapping("{id}")
	    public Optional<Satellites> getById(@PathVariable Integer id){
	    	return repository.findById(id);
	    }
}
