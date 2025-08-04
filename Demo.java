package com.user.defined.Exceptions;

//Main class to demonstrate usage
public class Demo {

	// Method to get name by ID
	private String getName(int id) {
		if (id == 100) {
			return "Raju";
		} else if (id == 101) {
			return "Rani";
		} else {
			// Throw custom exception when ID is not found
			throw new NoDataFoundException("Invalid Id: " + id);
		}
	}

	public static void main(String[] args) {
		Demo d = new Demo();

		try {
			// Try to get name by ID
			String name = d.getName(100); // This will throw exception
			System.out.println("Name: " + name);
		} catch (NoDataFoundException e) {
			// Handle the custom exception
			System.out.println("Exception occurred: " + e.getMessage());
		}
	}
}