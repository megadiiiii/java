package de5_rm;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mega.D
 */
public class SinhvienUTT extends Sinhvien {
    private String department;
    private int salary;

    public SinhvienUTT() {
    }

    public SinhvienUTT(String id, String name, String dob, String gender, double gpa, String department, int salary) {
        super(id, name, dob, gender, gpa);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Phong ban:" + department + ", Luong: " + salary;
    }

    @Override
    public String toWriteFiles() {
        return super.toWriteFiles() + department + "|" + salary;
    }

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Don vi: ");
        department = sc.nextLine();
        System.out.print("Luong: ");
        salary = sc.nextInt();
        sc.nextLine();
    }
    
    
}
