package warehouse.model;

import java.util.List;

public class Product {
	private int id;
	private String productname;
	private int quantity;
	private List<Takeout> takeout;

	public List<Takeout> getTakeout() {
		return takeout;
	}

	public void setTakeout(List<Takeout> takeout) {
		this.takeout = takeout;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
