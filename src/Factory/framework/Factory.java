package Factory.framework;

public abstract class Factory {

	/**
	 * createProduct的三种实现方式
	 * 1、指定为抽象方法
	 * 2、为其实现默认处理
	 * 3、抛出异常方法（子类必须实现，否则会报错）
	 * 后两种主要是Factory不能为抽象时的变通
	 */
	protected abstract Product createProduct(String owner);
	
	protected abstract void registerProduct(Product product);
	
	public final Product create(String owner){
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	
}
