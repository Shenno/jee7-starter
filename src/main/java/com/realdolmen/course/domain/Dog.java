package com.realdolmen.course.domain;

public class Dog {
	private String breed;
	private String color;

	public Dog(String breed, String color) {
		this.breed = breed;
		this.color = color;
	}

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

}
