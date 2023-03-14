package za.ac.cput.cput;

import za.ac.cput.cput.domain.Employee;
import za.ac.cput.cput.factory.EmployeeFactory;

public class Main {
    public static void main(String[] args) {
        Employee emp = EmployeeFactory.createEmployee("David", "Garrancho", "DavidG@gmail.com");
        System.out.println(emp);
    }
}