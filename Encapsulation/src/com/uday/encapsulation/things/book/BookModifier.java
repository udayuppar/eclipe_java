package com.uday.encapsulation.things.book;

public class BookModifier {
	public void useBook(Book book) {
		System.out.println("accesing book writer name:" + book.getWriter());
		book.setWriter("Bendre");
		System.out.println("modifing book writer name:" + book.getWriter());
		System.out.println("Book name:" + book.name);
		System.out.println("Book type:" + book.type);
		System.out.println("Book types:" + book.types);
		System.out.println("Book freeToWrite:" + book.freeToWrite);
		System.out.println("Book typeOfBooks:" + book.typeOfBooks);
		System.out.println("Book bookStoreName:" + book.bookStoreName);
		System.out.println("Book price:" + book.price);
		System.out.println("Book totalStudentsUsedBooks:" + book.totalStudentsUsedBooks);
		System.out.println("Book countryMostBookUsed:" + book.countryMostBookUsed);
		System.out.println("Book printingYear:" + book.printingYear);
	}

}
