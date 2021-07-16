package com.tcc.Satellitechecker.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SatellitesService {
	private final SatellitesRepository satRepository;
	private final ModulesRepository modRepository;
	private final MeasuresRepository meaRepository;
	
	/* public Satellites completeSave(final Satellites newSatellite) {
		Satellites satellite;
		List<Modules> modules = newSatellite.getModules();
		List<Measures> measures = newSatellite.getMeasures();
		newSatellite.setModules(null);
		satellite = this.satRepository.saveAndFlush(newSatellite);
		List<Modules> resultM = new ArrayList<Modules>();
		if(modules!=null)
		    for (Modules module: modules) {
		    	System.out.println("pipoRisk.getId()" + satellite.getId());
		    	module.setId(satellite.getId());
		        resultM.add(modRepository.save(module));
		    }
		List<Measures> resultS = new ArrayList<Measures>();
		if(measures!=null)
		    for (Measures measure: measures) {
		    	System.out.println("pipoRisk.getId()" + satellite.getId());
		    	measure.setId(satellite.getId());
		        resultS.add(meaRepository.save(measure));
		    }
	    satellite.setModules(resultM);
	    satellite.setMeasures(resultS);
		return satellite;
        } */
	}


