package com.uday.encapsulation.things.book;

public class Book {
	String name = "Panchatantra";
	String type = "neethi";
	private String writer = "Kuvempu";
	int types = 5;
	boolean freeToWrite = true;
	String typeOfBooks = "Comedy";
	String bookStoreName = "S R book store";
	double price = 500;
	int totalStudentsUsedBooks = 50;
	String countryMostBookUsed = "India";
	String printingYear = "02/01/2022";

	public String getWriter() {
		return writer;
	}

	void setWriter(String writer) {
		this.writer = writer;
	}

	void setName(String name) {
		this.name = name;
	}

	void setType(String type) {
		this.type = type;
	}

	void setTypes(int types) {
		this.types = types;
	}

	void setFreeToWrite(boolean freeToWrite) {
		this.freeToWrite = freeToWrite;
	}

	void setTypeOfBooks(String typeOfBooks) {
		this.typeOfBooks = typeOfBooks;
	}

	void setBookStoreName(String bookStoreName) {
		this.bookStoreName = bookStoreName;
	}

	void setPrice(double price) {
		this.price = price;
	}

	void setTotalStudentsUsedBooks(int totalStudentsUsedBooks) {
		this.totalStudentsUsedBooks = totalStudentsUsedBooks;
	}

	void setCountryMostBookUsed(String countryMostBookUsed) {
		this.countryMostBookUsed = countryMostBookUsed;
	}

	void setPrintingYear(String printingYear) {
		this.printingYear = printingYear;
	}

}
