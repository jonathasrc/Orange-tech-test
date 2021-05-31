package com.orange.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.orange.utils.GetDayOfWeek;
import com.orange.utils.Rotation;

@Entity
@Table(name = "tb_vehicles")
public class Vehicle implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String brand;
	private String model;
	private String year;

	private boolean rotation;

	@JsonIgnore
	@ManyToMany(mappedBy = "vehicles")
	private List<User> users = new ArrayList<>();

	public Vehicle() {
	}

	public Vehicle(Long id, String brand, String model, String year) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.setRotation();
	}

	public Long getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public boolean isRotation() {
		return rotation;
	}

	public void setRotation() {
		String regex = "[^a-z].*";
		String year = GetDayOfWeek.dayOfWeek().replaceFirst(regex, "");
		year = year.substring(0, 1).toUpperCase().concat(year.substring(1));
		System.out.println(year);
		this.rotation = Rotation.podeCircularNoRodizio(this.getYear(), year);
	}

	public List<User> getUsers() {
		return users;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehicles [brand=" + brand + ", model=" + model + ", year=" + year + "]";
	}

}
