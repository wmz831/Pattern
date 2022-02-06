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
		//ע��index++Ϊ���д����������ֵ�������������׳���������������
		return bookshelf.getBookAt(index++);
	}

}
