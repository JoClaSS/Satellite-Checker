package com.tcc.Satellitechecker.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import javax.persistence.Column;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="satellites")
public class Satellites {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Integer id;
	  @Column(name="description", nullable=false)
	  private String description;
	  @OneToMany
	  @JoinColumn(name = "satellites_id")
	  private List<Measures> measures;
}
