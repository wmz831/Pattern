package Factory.idcard;

import Factory.framework.Product;

public class IDCard extends Product{

	private String owner;
	
	IDCard(String owner) {
		this.owner = owner;
	}
	
	@Override
	public void use() {
		System.out.println("Ê¹ÓÃ"+ owner +"µÄIDCard");
	}
	
	public String getOwner() {
		return owner;
	}

}
