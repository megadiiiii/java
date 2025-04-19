/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de3;

/**
 *
 * @author Mega.D
 */
public class NhanVien extends Person {
    private String department;
    private double hsl;
    private int thamnien;
    private int lcb;

    public NhanVien() {
    }

    public NhanVien(String name, String dob, String add, String gender, String department, double hsl, int thamnien, int lcb) {
        super(name, dob, add, gender);
        this.department = department;
        this.hsl = hsl;
        this.thamnien = thamnien;
        this.lcb = lcb;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getHsl() {
        return hsl;
    }

    public void setHsl(double hsl) {
        this.hsl = hsl;
    }

    public int getThamnien() {
        return thamnien;
    }

    public void setThamnien(int thamnien) {
        this.thamnien = thamnien;
    }

    public int getLcb() {
        return lcb;
    }

    public void setLcb(int lcb) {
        this.lcb = lcb;
    }
    
    public double getSalary() {
        return lcb * hsl * (1 + thamnien/100);
    }

    @Override
    public String toString() {
        return super.toString() + ", Phong ban: " + department + ", HSL: " + hsl + ", Tham nien: " + thamnien + ", LCB: " + lcb + ", Thuc linh: " + getSalary() ;
    }
    
    
}
