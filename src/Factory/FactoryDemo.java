package Factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import Factory.framework.Factory;
import Factory.framework.Product;
import Factory.idcard.IDCardFactory;

public class FactoryDemo {
	
	public static void main(String[] args) {
		Factory f = new IDCardFactory();
		Product p1 = f.create("wmz");
		Product p2 = f.create("ss");
		p1.use();
		p2.use();
		
		((IDCardFactory)f).getOwners().forEach(tmp -> {
			System.out.println(tmp);
		});
	}

}
