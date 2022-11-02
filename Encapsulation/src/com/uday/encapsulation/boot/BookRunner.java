package com.uday.encapsulation.boot;

import com.uday.encapsulation.things.book.Book;
import com.uday.encapsulation.things.book.BookModifier;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		System.out.println(book.getWriter());

		BookModifier modi = new BookModifier();
		modi.useBook(book);

	}

}
