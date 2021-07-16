package com.tcc.Satellitechecker.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="measures")
public class Measures {

	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Integer id;
	  @Column(name="sample")
	  private int sample;
	  @Column(name="message")
	  private String message;
	  @Column(name="status_report")
	  private Boolean status;
	  @Column(name="sample_time")
	  @Temporal(TemporalType.TIMESTAMP)
	  private Date sample_time;
	  //FKs
	  @Column(name="satellites_id")
	  private Integer satellites_id;
	  @Column(name="modules_id")
	  private Integer modules_id;
}
