package Adapter;

public class AdapterDemo {

	/**
	 * Adapter�������ͬ�ӿ�֮��ķ�϶��Ҳ�������ڴ���汾�����ͼ���������
	 * Adapterģʽ������� ����������䣬�����µ��࣬ʹ�þ������Ե�����Ӱ�ȫ��Ҳ�ɼ�Сdebug��Χ
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
