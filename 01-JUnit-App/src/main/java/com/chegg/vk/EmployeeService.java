package com.chegg.vk;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.ashokit.Employee;

public class EmployeeService {

	

    public Employee biggestSalaryEmployee(List<Employee> employeeList) throws NoEmployeeException {
        return Optional.ofNullable(employeeList)
                .orElseGet(ArrayList::new)
                .stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow(() -> new NoEmployeeException("No employee found"));
    }

    public Employee biggestSalaryEmployeeInCity(List<Employee> employeeList, String city) throws NoEmployeeException {
        return Optional.ofNullable(employeeList)
                .orElseGet(ArrayList::new)
                .stream()
                .filter(t -> t.getCity().equals(city))
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow(() -> new NoEmployeeException("No employee found"));

    }

    public String getMostEmployeesCity(List<Employee> employeeList) {
        return Optional.ofNullable(employeeList)
                .orElseGet(ArrayList::new)
                .stream()
                .collect(Collectors.groupingBy(Employee::getCity, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(es -> es.getKey())
                .orElseThrow(() -> new IllegalStateException("Nie znaleziono miasta!"));
    }

    public double getAverageSalary(List<Employee> employeeList, String position) {
        return Optional.ofNullable(employeeList)
                .orElseGet(ArrayList::new)
                .stream()
                .filter(e -> e.getPosition().equals(position))
                .mapToDouble(Employee::getSalary)
                .average()
                .orElseThrow(() -> new IllegalStateException("Nie można obliczyć średniej!"));
    }
	
	
	
}
