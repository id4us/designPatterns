package com.example.designpattern.adapter;


import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList(){

        List<Employee> employees = new ArrayList<>();

        Employee employeeDb=new EmployeeDb("124","John","Wick","john@wick.com");
        EmployeeLdap employeeLdap=new EmployeeLdap("1243","Han","Solo","han@solo.com");
        EmployeeCsv employeeCsv = new EmployeeCsv("567,Sherlock,holmes,ext@email.com");


        employees.add(employeeDb);
        employees.add(new EmployeeAdapterLdap(employeeLdap));
        employees.add(new EmployeeAdapterCsv(employeeCsv));
        return employees;

    }



}
