package RealTimeExample;

import java.util.ArrayList;
import java.util.Arrays;


public class EmployeeData {

    public static ArrayList<Employee> getEmployeeData() {
        return new ArrayList<Employee>(Arrays.asList(
                new Employee(1, "amanda", "miller", "DEV", "SE", 19000.00, 30),
                new Employee(2, "did", "morris", "DEV", "VP", 25000.00, 40),
                new Employee(3, "arora", "maheshwari", "ADMIN", "VP", 27000.00, 45),
                new Employee(4, "nathan", "metta", "HR", "HR", 30000.00, 28), // "metta" starts/ends with 'm/a'
                new Employee(5, "otto", "murdock", "DEV", "DBA", 26000.00, 40),
                new Employee(6, null, "peters", "ADMIN", "DEVOPS", 18000.00, 40),
                new Employee(7, "philip", "peters", "ADMIN", "DEVOPS", 18000.00, 40) // Salary < 20k for testing
        ));
    }
}
