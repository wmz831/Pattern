package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bookshelf implements Aggregate{
	
	private List<Book> books;
	//private int last=0;
	
	public Bookshelf(int maxsize) {
		this.books = new ArrayList(maxsize);
	}
	
	public Book getBookAt(int index) {
		return books.get(index);
	}
	
	public void appendBook(Book book) {
		this.books.add(book);
		//last++;
	}
	
	public int getLength(){
		return books.size();
	}

	/**
	 * ´´½¨Iterator½ÇÉ«
	 */
	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

}
