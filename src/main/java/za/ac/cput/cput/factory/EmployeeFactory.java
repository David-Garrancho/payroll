package za.ac.cput.cput.factory;

import za.ac.cput.cput.util.Helper;
import za.ac.cput.cput.domain.Employee;


public class EmployeeFactory {
    public static Employee createEmployee(String firstName, String lastName, String email) {
        if (Helper.isNullOrEmpty(firstName) == true || Helper.isNullOrEmpty(lastName) == true)
            return null;

        if(!Helper.isValidEmail(email)){
            return null;
        }

        String employeeNumber = Helper.generateId();

        return new Employee.Builder().setFirstName(firstName)
                .setLastName(lastName)
                .setEmployeeNumber(employeeNumber)
                .setEmail(email)
                .build();
    }
}
