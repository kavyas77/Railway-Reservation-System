package com.Train;

public class Person {
	private String name;
	private int age;
	private String TrainName;
	private int seatNumber;
	
	public Person(String name, int age, String TrainName, int seatNumber) {
		this.name = name;
		this.age = age;
		this.TrainName = TrainName;
		this.seatNumber = seatNumber;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getTrainName() {
		return TrainName;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	

}
