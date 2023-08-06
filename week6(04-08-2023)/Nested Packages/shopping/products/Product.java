package shopping.products;
public class Product{
    String productName;
    int productPrice;
    public Product(String name,int price){
        productName = name;
        productPrice = price;
    }
    public void describeProduct(){
        System.out.println(productName+" Costs Rs."+productPrice);
    }
}
        