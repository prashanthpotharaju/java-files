package com.prashanth.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private String name;
    private String email;
    private String password;
    private String gender;
    private String city;
    private int totalMarks;
    private double avg;
}
