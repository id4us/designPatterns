package com.example.designpattern.adapter;


public class EmployeeAdapterCsv implements Employee {

    private EmployeeCsv employeeCsv;
    public EmployeeAdapterCsv(EmployeeCsv employeeCsv) {
        this.employeeCsv=employeeCsv;
    }

    @Override
    public String getId() {
        return String.valueOf(employeeCsv.getId());
    }

    @Override
    public String getFirstName() {
        return employeeCsv.getFirstName();
    }

    @Override
    public String getLastName() {
        return employeeCsv.getLastName();
    }

    @Override
    public String getEmail() {
        return employeeCsv.getEmailAddress();
    }

    @Override
    public String toString() {
        return employeeCsv.toString();
    }
}
