package com.uday.copies.things;
import com.uday.copies.boot.Song;
public class SongRunner {

	public static void main(String[] args) {
		
		Song magic=new Song();
		System.out.println(magic.name);
		System.out.println(magic.lang);
		System.out.println(magic.singer);
		System.out.println(magic.lyricst);
		System.out.println(magic.type);
		
		System.out.println("------------");
		
		magic.name="kantara";
		magic.lang="kannada";
		magic.singer="Shreya Ghoshal ";
		magic.lyricst="Pramod Maravanthe";
		magic.type="romantic";
		
		System.out.println(magic.name);
		System.out.println(magic.lang);
		System.out.println(magic.singer);
		System.out.println(magic.lyricst);
		System.out.println(magic.type);

	}

}
