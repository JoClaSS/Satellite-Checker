package com.tcc.Satellitechecker.domain;

import lombok.Data;

@Data
public class ModulesDTO {
  private Integer sample;
  private String message;
  private Boolean status;
  private Integer satellites_id;
  private Integer modules_id;
  
  
  public Measures transformToObject(ModulesDTO dto) {
		Measures measure = new Measures();
		measure.setMessage(dto.getMessage());
		measure.setSample(dto.getSample());
		measure.setStatus(dto.getStatus());
		return measure;
  } 
}
