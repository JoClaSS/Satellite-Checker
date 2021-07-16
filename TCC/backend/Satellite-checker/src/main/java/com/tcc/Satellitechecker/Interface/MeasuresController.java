package com.tcc.Satellitechecker.Interface;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;



import com.tcc.Satellitechecker.domain.Measures;
import com.tcc.Satellitechecker.domain.MeasuresRepository;
import com.tcc.Satellitechecker.domain.MeasuresService;
import com.tcc.Satellitechecker.domain.Modules;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/measures")
@RequiredArgsConstructor
public class MeasuresController {

	private final MeasuresRepository repository;

	
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Measures save(@RequestBody Measures newMeasure) {
    	return repository.save(newMeasure);
    }
 
    @GetMapping
    public List<Measures> getAll(){
    	return repository.findAll();
    }
    
    @GetMapping("/search")
    public List<Measures> getMeasure(
    		@RequestParam(value = "sample", required = false) Integer sample,
    		@RequestParam(value = "message", required = false) String message,
    		@RequestParam(value = "status", required = false) Boolean status,
    		@RequestParam(value = "modules_id", required = false) Integer modules_id,
    		@RequestParam(value = "satellites_id", required = false) Integer satellites_id
    		){
    	return repository.findMeasures(sample, message, status, modules_id,satellites_id);
    }
    
}
