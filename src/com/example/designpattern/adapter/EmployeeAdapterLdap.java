package com.example.designpattern.adapter;

public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap employeeLdap;

    public EmployeeAdapterLdap(EmployeeLdap instance) {
        this.employeeLdap= instance;
    }

    @Override
    public String getId() {
        return employeeLdap.getCn() ;
    }

    @Override
    public String getFirstName() {
        return employeeLdap.getGivenName();
    }

    @Override
    public String getLastName() {
        return employeeLdap.getSurname();
    }

    @Override
    public String getEmail() {
        return employeeLdap.getMail();
    }

    public String toString() {
        return employeeLdap.toString();
    }
}
