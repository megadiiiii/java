package de5_rm;

import java.util.*;

public class Sinhvien {

    private String id;
    private String name;
    private String dob;
    private String gender;
    private double gpa;

    public Sinhvien() {
    }

    public Sinhvien(String id, String name, String dob, String gender, double gpa) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toWriteFiles() {
        return id + "|" + name + "|" + dob + "|" + gender + "|" + gpa + "|";
    }

    @Override
    public String toString() {
        return "Ho ten: " + id + ", Ten: " + name + ", Ngay sinh: " + dob + ", Gioi tinh: " + gender + ", Diem tong ket: " + gpa;
    }

    public void input(Scanner sc) {
        System.out.print("Ma SV: ");
        id = sc.nextLine();
        System.out.print("Ten: ");
        name = sc.nextLine();
        System.out.print("Ngay sinh: ");
        dob = sc.nextLine();
        System.out.print("Gioi tinh: ");
        gender = sc.nextLine();
        System.out.print("Diem tong ket: ");
        gpa = sc.nextDouble();
        sc.nextLine();
    }
}
