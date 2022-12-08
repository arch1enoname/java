package com.mukhambetkaliev.department;

public class Employee
{
    Department department;
    String name;

    public Employee(String name)
    {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department=" + department.departmentName +
                ", name='" + name + '\'' +
                '}';
    }
}
