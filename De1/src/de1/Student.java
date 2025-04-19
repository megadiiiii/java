/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de1;

/**
 *
 * @author Mega.D
 */
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
        return "MSV: " + id + ", Email: " + email + ", Diem tong ket: " + gpa;
    }
}
