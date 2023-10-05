package com.zj.springbootproductseller.model;


import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "gender",nullable = false)
    private String gender;

    @Column(name = "city",nullable = false)
    private String city;

    @Column(name = "phone",nullable = false)
    private String phone;

    @Column(name = "date",nullable = false)
    private LocalDate date; // Changed type to LocalDate

    @Column(name = "username",unique = true,nullable = false,length = 100)
    private String username;



    @Column(name = "password",nullable = false)
    private String password;


    @Column(name = "create_time",nullable = false)
    private LocalDateTime createTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

    @Transient
    private String token;

    // Add a method to get the date as a formatted string
    public String getFormattedDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return date.format(formatter);
    }

    // Add a method to set the date from a formatted string
    public void setFormattedDate(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        this.date = LocalDate.parse(dateString, formatter);
    }

}

