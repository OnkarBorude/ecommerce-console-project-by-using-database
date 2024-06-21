package ProductManagement;

public class Product {
	String productname;
	int productquantity;
	long productprice;
	
	public void printproduct() {
		System.out.println("Product Name: "+productname);
		System.out.println("Product Quantity: "+productquantity);
		System.out.println("Product Price: "+productprice);
	}

}
