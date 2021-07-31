package com.tcc.Satellitechecker.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	  @SequenceGenerator(name="seqs",sequenceName="sat_seq", allocationSize = 0)
	  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqs")
	  private Integer id;
	  @Column(name="description", nullable=false)
	  private String description;
	  @ManyToMany
	  @JsonIgnore
	  private List<Modules> modules;
}
