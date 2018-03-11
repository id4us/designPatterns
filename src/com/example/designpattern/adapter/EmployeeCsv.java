package com.example.designpattern.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.StringTokenizer;

@Data
@AllArgsConstructor
public class EmployeeCsv {

    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;

    public EmployeeCsv(String values){
        StringTokenizer stringTokenizer = new StringTokenizer(values,",");

        if(stringTokenizer.hasMoreElements()){
            id = Integer.parseInt(stringTokenizer.nextToken());
        }
        if (stringTokenizer.hasMoreElements()){
            firstName= stringTokenizer.nextToken();
        }
        if (stringTokenizer.hasMoreElements()){
            lastName=stringTokenizer.nextToken();
        }
        if (stringTokenizer.hasMoreElements()){
            emailAddress= stringTokenizer.nextToken();
        }
    }

}
