package ProductManagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProductManagement {

	public static void productmanagemnet() throws IOException {
		System.out.println("****Welcome to product Management****");
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		boolean shouldcontinue = true;
		while (shouldcontinue) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("What would you like to do today");
			System.out.println("    1.Add Product");
			System.out.println("    2.Update Prodcut");
			System.out.println("    3.Search Product");
			System.out.println("    4.Delete Product");
			System.out.println("    5.Print Product");
			System.out.println("    9.Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Add Product");
				System.out.println("Enter Product Name: ");
				product.productname = sc1.nextLine();
				System.out.println("Enter Product Quantity: ");
				product.productquantity = sc1.nextInt();
				System.out.println("Enter Product Price: ");
				product.productprice = sc1.nextLong();
				System.out.println("Product Added Successfully");
				String path = "C:\\Users\\onkar\\eclipse-workspace\\Ecommerce1\\src\\ProductManagement\\product.txt";
				File file = new File(path);
				FileWriter filewriter = new FileWriter(file, true);
				BufferedWriter bufferwriter = new BufferedWriter(filewriter);
				bufferwriter.write(product.productname + " " + product.productquantity + " " + product.productprice);
				bufferwriter.newLine();
				bufferwriter.flush();
				break;

			case 2:
				System.out.println("Update Product Operation not yet implemented");
				break;

			case 3:
				System.out.println("Enter product name that you want to search: ");
				String proname = sc1.nextLine();
				boolean loop = true;
				String filepath = "C:\\Users\\onkar\\eclipse-workspace\\Ecommerce1\\src\\ProductManagement\\product.txt";
				File file1 = new File(filepath);
				FileReader filereader = new FileReader(file1);
				BufferedReader bufferReader = new BufferedReader(filereader);
				while (loop) {
					String line = bufferReader.readLine();
					if (line == null) {
						loop = false;
					}
					if (line != null && line.contains(proname)) {
						System.out.println(
								product.productname + " " + product.productquantity + " " + product.productprice);
						bufferReader.close();
						loop = false;
					}
				}
				break;

			case 4:
				System.out.println("Delete Product Operation not yet implemented");
				break;

			case 5:
				product.printproduct();
				break;

			case 9:
				System.out.println("Exit product management successfully...");
				shouldcontinue = false;
				break;
			default:
				System.out.println("Incorrect Input");
			}
		}

	}

}
