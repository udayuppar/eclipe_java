package com.uday.copies.boot;

public class Fish {

	public String name;
	public char size;
	public int price;
	public int weight;
	public float length;

	public Fish()

	{
		System.out.println("pointing to default values");

	}

	public Fish(String name) {
		this.name = name;
		System.out.println("parameter variables  pointed to memory");

	}

	public Fish(char size) {
		this.size = size;
		System.out.println("parameter variables  pointed to memory");

	}

	public Fish(int price, int weight) {
		this.price = price;
		this.weight = weight;
		System.out.println("parameter variables  pointed to memory");

	}

	public Fish(int weight) {
		this.weight = weight;
		System.out.println("parameter variables  pointed to memory");

	}

	public Fish(float length) {
		this.length = length;
		System.out.println("parameter variables  pointed to memory");

	}

	public Fish(float length, String name) {
		this.length = length;
		this.name = name;
		System.out.println("parameter variables  pointed to memory");

	}

	public Fish(char size, String name) {
		this.size = size;
		this.name = name;
		System.out.println("parameter variables  pointed to memory");

	}

}
