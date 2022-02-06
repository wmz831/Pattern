package Adapter;

public class AdapterDemo {

	/**
	 * Adapter用于填补不同接口之间的缝隙，也经常用于处理版本迭代和兼容性问题
	 * Adapter模式会对现有 的类进行适配，生产新的类，使用经过测试的类更加安全，也可减小debug范围
	 */
	public static void main(String[] args) {
		Print p = new PrintBanner("Pattern");
		p.printWeak();
		p.printStrong();
		
		Print2 p2 = new PrintBanner2("Pattern");
		p.printWeak();
		p.printStrong();
	}

}
