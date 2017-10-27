package javacollection.map.hashmap;

public class Price {

	private String product;
	private int price;
	
	public Price (String name, int price) {
		this.product = name;
		this.price = price;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return price*20;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void print() {
		System.out.println("Item: "+getProduct()+"====> Price: "+getPrice());
	}
}
