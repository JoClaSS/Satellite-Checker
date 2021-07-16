package com.tcc.Satellitechecker.domain;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.Column;




@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="modules")
public class Modules {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer id;
	  @Column(name="modulename", nullable=false)
	  private String modulename;
	  @Column(name="modulefunction")
	  private String modulefunction;
	  @Column(name="moduleclass")
	  private String moduleclass;
	  @Column(name="moduleobject")
	  private String moduleobject;
	  @Column(name="category1")
	  private String category1;
	  @Column(name="category2")
	  private String category2;
	  @Column(name="measure")
	  private String type;
	  @Column(name="moduledescription")
	  private String moduledescription;
	  @OneToMany
	  @JoinColumn(name = "modules_id")
	  private List<Measures> measures;
}