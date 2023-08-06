package shopping.orders;
public class Order{
	int orderId;
	String orderDate;
	public Order(int id,String date){
		orderId = id;
		orderDate = date;
	}
	public void describeOrder(){
		System.out.println("Order: "+orderId+"Placed On :"+orderDate);
	}
}