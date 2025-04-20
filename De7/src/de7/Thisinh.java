package de7;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

public class Thisinh {

    private String name;
    private String dob;
    private String add;

    public Thisinh() {
    }

    public Thisinh(String name, String dob, String add) {
        this.name = name;
        this.dob = dob;
        this.add = add;
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

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "Ho ten: " + name + ", Ngay sinh: " + dob + ", Dia chi: " + add;
    }

    public void input(Scanner sc) {
        System.out.print("Ten: ");
        name = sc.nextLine();
        System.out.print("Ngay sinh: ");
        dob = sc.nextLine();
        System.out.print("Dia chi: ");
        add = sc.nextLine();
    }

}
