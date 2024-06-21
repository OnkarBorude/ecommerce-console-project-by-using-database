package UserManagement;

public class User {
	String firstname;
	String lastname;
	String gender;
	int age;
	String email;
	String password;

	public void printUser() {
		System.out.println("Firs Name: " + firstname);
		System.out.println("lastname: " + lastname);
		System.out.println("gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Email: " + email);
	}

}
