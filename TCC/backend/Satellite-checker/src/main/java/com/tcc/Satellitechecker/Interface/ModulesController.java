package com.tcc.Satellitechecker.Interface;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tcc.Satellitechecker.domain.ModulesRepository;
import com.tcc.Satellitechecker.domain.Satellites;
import com.tcc.Satellitechecker.domain.Measures;
import com.tcc.Satellitechecker.domain.Modules;
import com.tcc.Satellitechecker.domain.ModulesDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/modules")
@RequiredArgsConstructor
public class ModulesController {
		private final ModulesRepository repository;
		    
		
	    @PostMapping
	    @ResponseStatus(HttpStatus.CREATED)
	    public Modules saveSatellite(@RequestBody Modules module) {
	    	return repository.save(module);	    	
	    }
		
		
		    @GetMapping
		    public List<Modules> getAll(){
		    	return repository.findAll();
		    }
		    
		    @GetMapping("/search")
		    public List<Modules> getByModuleName(
		    		@RequestParam(value = "name", required = false) String name,
		    		@RequestParam(value = "function", required = false) String function,
		    		@RequestParam(value = "class", required = false) String mclass,
		    		@RequestParam(value = "object", required = false) String object,
		    		@RequestParam(value = "category1", required = false) String category1,
		    		@RequestParam(value = "category2", required = false) String category2,
		    		@RequestParam(value = "type", required = false) String type,
		    		@RequestParam(value = "description", required = false) String description
		    		){
		    	return repository.findModules(name, function, mclass, object, category1, category2, type, description);
		    }
	}
;
