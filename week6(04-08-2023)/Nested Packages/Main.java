import shopping.products.*;
import shopping.orders.*;
class Main{
	public static void main(String args[]){
		Product p = new Product("Hp-Laptop",50000);
		Order o = new Order(554,"05-08-2023");
		p.describeProduct();
		o.describeOrder();
	}
}