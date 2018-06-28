package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dwarves")
public class dwarf {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String height;
	private String beardColor;
	private int beardLength;
	private String favoriteDrink;
	private String occupation;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getBeardColor() {
		return beardColor;
	}
	public void setBeardColor(String beardColor) {
		this.beardColor = beardColor;
	}
	public int getBeardLength() {
		return beardLength;
	}
	public void setBeardLength(int beardLength) {
		this.beardLength = beardLength;
	}
	public String getFavoriteDrink() {
		return favoriteDrink;
	}
	public void setFavoriteDrink(String favoriteDrink) {
		this.favoriteDrink = favoriteDrink;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	} 
	

}
