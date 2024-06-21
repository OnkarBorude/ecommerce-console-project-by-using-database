package UserManagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import UserManagement.User;

public class UserManagement {
	public static void usermanagement() throws IOException {
		System.out.println("****Welcome User Management****");
		Scanner sc = new Scanner(System.in);
		User user = new User();
		boolean shouldrunning = true;
		while (shouldrunning) {
			System.out.println("\nWhat you would like to do?");
			System.out.println("1.Add User");
			System.out.println("2.Update User");
			System.out.println("3.Search User");
			System.out.println("4.Delete User");
			System.out.println("5.Print User");
			System.out.println("9.Exit");
			System.out.println("Enter Your choice: ");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Add User");
				System.out.println("Enter First Name");
				user.firstname = sc.next();
				System.out.println("Enter last name");
				user.lastname = sc.next();
				System.out.println("Enter gender");
				user.gender = sc.next();
				System.out.println("Enter Age");
				user.age = sc.nextInt();
				System.out.println("Enter Email");
				user.email = sc.next();
				System.out.println("Enter password");
				String password = sc.next();
				System.out.println("Enter Confirm Password");
				String confirmPassword = sc.next();
				if (password.equals(confirmPassword)) {
					user.password = password;
				} else {
					System.out.println("Password and confirm password does not match");
					System.out.println("User Addition failed");
				}
				System.out.println("User Added Successfully!!!!");
				String path="C:\\Users\\onkar\\eclipse-workspace\\Ecommerce1\\src\\UserManagement\\user.txt";
				File file=new File(path);
				FileWriter filewriter=new FileWriter(file, true);
				BufferedWriter bufferwriter=new BufferedWriter(filewriter);
				bufferwriter.write(user.firstname+" "+user.lastname+" "+user.gender+" "+user.age+" "+user.email);
				bufferwriter.newLine();
				bufferwriter.flush();
				break;

			case 2:
				System.out.println("Update User Operation not yet implemented");
				break;
			case 3:
				System.out.println("Enter user that you want to search: ");
				String usersearch=sc.next();
				String filepath="C:\\Users\\onkar\\eclipse-workspace\\Ecommerce1\\src\\UserManagement\\user.txt";
				File file1=new File(filepath);
				FileReader filereader=new FileReader(file1);
				BufferedReader bufferReader=new BufferedReader(filereader);
				boolean loop=true;
				while(loop) {
					String line=bufferReader.readLine();
					if(line==null) {
						loop=false;
						
					}
					if(line!=null && line.contains(usersearch)) {
						System.out.println(user.firstname+" "+user.lastname+" "+user.gender+" "+user.age+" "+user.email);
						bufferReader.close();
						loop=false;
					}
					
				}
				break;
			case 4:
				System.out.println("Delete User Operation not yet implemented");
				break;
			case 5:
				user.printUser();
				break;
			case 9:
				System.out.println("Exit User Management successfully");
				shouldrunning = false;
				break;
			default:
				System.out.println("Incorrect Input");

			}

		}

}
}
