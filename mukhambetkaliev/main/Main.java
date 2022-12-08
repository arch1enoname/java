package com.mukhambetkaliev.main;


import com.mukhambetkaliev.department.Department;
import com.mukhambetkaliev.department.Employee;
import com.mukhambetkaliev.untitled.SumClass;
import com.mukhambetkaliev.untitled.Fraction;
import com.mukhambetkaliev.untitled.*;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Arthur");
        Department department = new Department("IT", employee);
        System.out.println(employee.getDepartment());
    }
}