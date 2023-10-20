package ch4;

import java.util.Scanner;

class Book1 {

	String author, title;

	public Book1(String t, String a) {
		this.author = a;
		this.title = t;
	}
}

public class BookArray {
	public static void main(String[] args) {
		Book1[] book = new Book1[2];

		Scanner scn = new Scanner(System.in);
		for (int i = 0; i < book.length; i++) {
			System.out.println("제목>>");
			String title = scn.nextLine();
			System.out.println("저자>>");
			String author = scn.nextLine();
			book[i] = new Book1(title, author);
		}
		for (int i = 0; i < book.length; i++) {
			System.out.println("(" + book[i].title + ", " + book[i].author + ")");
		}
		System.out.println("끝");
		scn.close();

	}
}
