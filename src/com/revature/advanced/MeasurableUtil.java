package com.revature.advanced;

public class MeasurableUtil {

    public static double average(Measureable[] objects) {
        if (objects == null || objects.length == 0) {
            return 0;
        }
        double total = 0;
        for (Measureable obj : objects) {
            total += obj.getMeasure();
        }
        return total / objects.length;
    }

    public static Measureable largest(Measureable[] objects) {
        if (objects == null || objects.length == 0) {
            return null;
        }
        Measureable largest = objects[0];
        for (Measureable obj : objects) {
            if (obj.getMeasure() > largest.getMeasure()) {
                largest = obj;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        // Creating an array of employee
        Employee[] employees = {
                new Employee("John", 50000),
                new Employee("Michael", 60000),
                new Employee("Bob", 70000)
        };

        // Computing the average salary of employees
        double averageSalary = MeasurableUtil.average(employees);
        System.out.println("Average salary of employees " + averageSalary);

        // Finding the employee with the largest salary
        Employee employeeWithLargestSalary = (Employee) MeasurableUtil.largest(employees);
        if (employeeWithLargestSalary != null) {
            System.out.println("Employee with the largest salary: " + employeeWithLargestSalary.getName());
        }
    }
}



