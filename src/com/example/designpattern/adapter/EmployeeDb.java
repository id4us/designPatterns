package com.example.designpattern.adapter;

import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class EmployeeDb implements Employee {

    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public EmployeeDb(String id,String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


}
