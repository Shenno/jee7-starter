package com.realdolmen.course.domain;

import java.io.Serializable;

public class Dog implements Serializable {
	private String breed;
	private String color;

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String bark() {
		return "Waf";
	}

}
