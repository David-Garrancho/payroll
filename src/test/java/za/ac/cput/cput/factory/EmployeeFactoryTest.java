package za.ac.cput.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.cput.domain.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
    public void test() {
        Employee e = EmployeeFactory.createEmployee("David", "Garrancho", "DavidG@gmail.com");
        System.out.println(e.toString());
        assertNotNull(e);
    }

}