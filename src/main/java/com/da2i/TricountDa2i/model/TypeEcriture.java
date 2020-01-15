package com.da2i.TricountDa2i.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the type_ecriture database table.
 * 
 */
@Entity
@NamedQuery(name="TypeEcriture.findAll", query="SELECT t FROM TypeEcriture t")
public class TypeEcriture implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idTypeEcriture;

	private String nomDuType;

	@OneToMany(mappedBy="typeEcriture")
	private List<Ecriture> ecritures;

	public TypeEcriture() {
	}

	public Integer getIdTypeEcriture() {
		return this.idTypeEcriture;
	}

	public void setIdTypeEcriture(Integer idTypeEcriture) {
		this.idTypeEcriture = idTypeEcriture;
	}

	public String getNomDuType() {
		return this.nomDuType;
	}

	public void setNomDuType(String nomDuType) {
		this.nomDuType = nomDuType;
	}

	public List<Ecriture> getEcritures() {
		return this.ecritures;
	}

	public void setEcritures(List<Ecriture> ecritures) {
		this.ecritures = ecritures;
	}

}