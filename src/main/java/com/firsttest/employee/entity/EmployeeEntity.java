package com.firsttest.employee.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "employee")
public class EmployeeEntity {

    @Id//for every primary key we need to anotate with @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)   //to automatically generate the particular id field
    private long id;
    private String firstname;
    private String lastname;
    private String emailid;



}
