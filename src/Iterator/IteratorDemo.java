package Iterator;

import java.util.Iterator;

public class IteratorDemo {

	/**
	 * Pattern思想
	 * 数组可以直接用for循环，引入Iterator模式的原因是：
	 * 可以将遍历与实现分开来， while循环不依赖Bookshelf的实现
	 * 比如，Bookshelf从Array换成Vector，只需修改Iterator的实例代码，上层调用者无需改变；
	 * 将遍历功能置于Aggregate角色之外，一个ConcreteAggregate可以编写多个ConcreteIterator，比如，先序后序、深度广度、跳跃式
	 * 
	 * 反例：难以理解抽象类和interface的人，总想使用具体的类来解决所有问题，很容易导致类之间的强耦合，这些类也难以被再次利用
	 * 切记：不要只使用具体类来编程，要优先使用抽象类和接口！
	 */
	public static void main(String[] args) {
		Bookshelf bookshelf = new Bookshelf(3);
		bookshelf.appendBook(new Book("Around the World in 80 Days"));
		bookshelf.appendBook(new Book("Think in Java"));
		bookshelf.appendBook(new Book("图解设计模式"));
		bookshelf.appendBook(new Book("亮剑"));
		bookshelf.appendBook(new Book("史记"));
		bookshelf.appendBook(new Book("资治通鉴"));
		Iterator<Book> it = bookshelf.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getName());
		}

	}
}
