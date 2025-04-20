package de4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;

public class Student extends Person {
    private String id;
    private String email;
    private double gpa;

    public Student() {
    }

    public Student(String name, String dob, String add, String gender, String id, String email, double gpa) {
        super(name, dob, add, gender);
        this.id = id;
        this.email = email;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ma SV: " + id + ", Email: " + email + ", Diem tong ket: " + gpa;
    }
    
    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Ma SV: ");
        id = sc.nextLine();
        System.out.print("Email: ");
        email = sc.nextLine();
        System.out.print("Diem tong ket: ");
        gpa = sc.nextDouble();
        sc.nextLine();
    }
    
}
