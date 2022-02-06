package Iterator;

import java.util.Iterator;

public class IteratorDemo {

	/**
	 * Pattern˼��
	 * �������ֱ����forѭ��������Iteratorģʽ��ԭ���ǣ�
	 * ���Խ�������ʵ�ַֿ����� whileѭ��������Bookshelf��ʵ��
	 * ���磬Bookshelf��Array����Vector��ֻ���޸�Iterator��ʵ�����룬�ϲ����������ı䣻
	 * ��������������Aggregate��ɫ֮�⣬һ��ConcreteAggregate���Ա�д���ConcreteIterator�����磬���������ȹ�ȡ���Ծʽ
	 * 
	 * �������������������interface���ˣ�����ʹ�þ������������������⣬�����׵�����֮���ǿ��ϣ���Щ��Ҳ���Ա��ٴ�����
	 * �мǣ���Ҫֻʹ�þ���������̣�Ҫ����ʹ�ó�����ͽӿڣ�
	 */
	public static void main(String[] args) {
		Bookshelf bookshelf = new Bookshelf(3);
		bookshelf.appendBook(new Book("Around the World in 80 Days"));
		bookshelf.appendBook(new Book("Think in Java"));
		bookshelf.appendBook(new Book("ͼ�����ģʽ"));
		bookshelf.appendBook(new Book("����"));
		bookshelf.appendBook(new Book("ʷ��"));
		bookshelf.appendBook(new Book("����ͨ��"));
		Iterator<Book> it = bookshelf.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getName());
		}

	}
}
