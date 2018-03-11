package com.example.designpattern.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EmployeeLdap {

    private String cn;
    private String surname;
    private String givenName;
    private String mail;

    @Override
    public String toString() {
        return "EmployeeLdap{" +
                "cn='" + cn + '\'' +
                ", surname='" + surname + '\'' +
                ", givenName='" + givenName + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}

