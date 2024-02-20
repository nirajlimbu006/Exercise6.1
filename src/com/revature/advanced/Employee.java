package com.revature.advanced;

public class Employee implements Measureable{

    private double salary;
    private String name;

    // Constructor
    public Employee(String name, double salary) {
        this.salary = salary;
        this.name = name;
    }

    // Implementation fo the getMeasure method from Measurable interface
    @Override
    public double getMeasure() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
