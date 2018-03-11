package com.example.designpattern.adapter;

import java.util.List;


public class AdapterDemo {

    public static void main(String[] args) {

        EmployeeClient employeeClient = new EmployeeClient();

        List<Employee> employeeList = employeeClient.getEmployeeList();

        employeeList.stream().forEach(employee -> {
            System.out.println(employee);
        });


    }
}
