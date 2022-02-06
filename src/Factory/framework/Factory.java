package Factory.framework;

public abstract class Factory {

	/**
	 * createProduct������ʵ�ַ�ʽ
	 * 1��ָ��Ϊ���󷽷�
	 * 2��Ϊ��ʵ��Ĭ�ϴ���
	 * 3���׳��쳣�������������ʵ�֣�����ᱨ��
	 * ��������Ҫ��Factory����Ϊ����ʱ�ı�ͨ
	 */
	protected abstract Product createProduct(String owner);
	
	protected abstract void registerProduct(Product product);
	
	public final Product create(String owner){
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	
}
