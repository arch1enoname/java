package com.mukhambetkaliev.department;


import java.util.ArrayList;
import java.util.List;

public class Department
{
    String departmentName;
    Employee boss;
    List<Employee> employees = new ArrayList<>();

    public Department() {}

    public Department(String departmentName, Employee boss) {
        this.departmentName = departmentName;
        this.boss = boss;
        boss.department = this;
        employees.add(boss);
    }
    public Department(String departmentName, Employee boss, Employee... employees)
    {
        this.employees = List.of(employees);
        this.boss = boss;
        this.departmentName = departmentName;
        this.employees.add(boss);
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Employee getBoss() {
        return boss;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", boss=" + boss.name +
                ", employees=" + employees +
                '}';
    }
}
