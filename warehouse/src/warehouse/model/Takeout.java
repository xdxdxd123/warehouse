package warehouse.model;

import java.util.Date;

public class Takeout {
private int id;
private int  quantity ;
private Date outDate;
private String  handler;
private  Product pro_id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Date getOutDate() {
	return outDate;
}
public void setOutDate(Date outDate) {
	this.outDate = outDate;
}
public String getHandler() {
	return handler;
}
public void setHandler(String handler) {
	this.handler = handler;
}
public Product getPro_id() {
	return pro_id;
}
public void setPro_id(Product pro_id) {
	this.pro_id = pro_id;
}


}
