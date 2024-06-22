package ecommerce;

import java.io.IOException;
import java.util.Scanner;

import ProductManagement.ProductManagement;
import UserManagement.UserManagement;

public class ApplicationMain {

	public static void main(String[] args) throws IOException {
		System.out.println("****Welcome to Ecommerce First****");
		Scanner sc=new Scanner(System.in);
		boolean shouldrun=true;
		while(shouldrun) {
		System.out.println("What you would like to do today");
		System.out.println("1.User Management");
		System.out.println("2.Product Management");
		System.out.println("9.Exit");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			UserManagement.usermanagement();
			break;
		case 2:
			ProductManagement.productmanagemnet();
			break;
		case 9:
			System.out.println("Exit Application Successfully");
			shouldrun=false;
			break;
		default:
			System.out.println("Incorrect Input");
				
		}

	}

	}

}
