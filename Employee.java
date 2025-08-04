package com.user.defined.Exceptions;

public class Employee {

    public String getName(int id) {
        if (id == 100) {
            return "Ramana";
        } else if (id == 101) {
            return "Tony";
        } else {
            throw new EmployeeData("Invalid id: " + id);
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee();
             try {
            String name = e.getName(1000);
            System.out.println(name);
             }catch (EmployeeData e2) {
			e2.printStackTrace();
			System.out.println(e2.getMessage());
			}
       
     
        }
    }
