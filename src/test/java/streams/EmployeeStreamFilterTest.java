package streams;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.testng.annotations.Test;
import models.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static utils.TestDataFactory.getEmployeeData;

public class EmployeeStreamFilterTest {

    ArrayList<Employee> employeeData = getEmployeeData();


    @Test
    public void tryAllStreamMethodsWithExamples() throws JsonProcessingException {

        //Print All Employees using forEach

        employeeData
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        //Salary >20k and lastName starts with "m"; if we want to reuse these salary in any other places.


        Predicate<Employee> highSalary = employee -> employee.getSalary() > 20000;
        Predicate<Employee> startLastNameWithM = employee -> employee.getLastName().toLowerCase().startsWith("m");

        employeeData
                .stream()
                .filter(highSalary.and(startLastNameWithM))
                .forEach(System.out::println);

        //Best practise to collect the data to any dataset like List or Set rather than terminal operation

        System.out.println("--------------------------------");

        Set<Employee> employeesWIthSalary20KAndLastNameStartWithM = employeeData
                .stream()
                .filter(highSalary.and(startLastNameWithM))
                .collect(Collectors.toSet());
        System.out.println(employeesWIthSalary20KAndLastNameStartWithM);

        System.out.println("--------------------------------");

        //Sort by firstName, here we are handling in case of Null data too

        List<Employee> employeeListSortByFirstName = employeeData.stream()
                .sorted(Comparator.comparing(Employee::getFirstName, Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER)))
                .toList();

        System.out.println(employeeListSortByFirstName);
    }
}
