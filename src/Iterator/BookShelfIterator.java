package Iterator;

import java.util.Iterator;

public class BookShelfIterator implements Iterator<Book>{
	
	private Bookshelf bookshelf;
	private int index = 0;

	public BookShelfIterator(Bookshelf bookshelf) {
		this.bookshelf = bookshelf;
	}
	
	@Override
	public boolean hasNext() {
		if( index < bookshelf.getLength()){
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Book next() {
		//注：index++为简便写法，先引用值再自增，但容易出错，不建议轻易用
		return bookshelf.getBookAt(index++);
	}

}
