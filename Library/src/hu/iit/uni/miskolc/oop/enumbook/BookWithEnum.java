package hu.iit.uni.miskolc.oop.enumbook;

import hu.iit.uni.miskolc.oop.Book;

public class BookWithEnum extends Book {

		public enum Style{
			SCIFI, COOK, ROMANCE, OTHER
		}
		
		private Style style;
		
}
