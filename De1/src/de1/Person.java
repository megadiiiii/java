/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de1;

/**
 *
 * @author Mega.D
 */
public class Person {
    private String name;
    private String dob;
    private String add;
    private String gender;

    public Person() {
    }

    public Person(String name, String dob, String add, String gender) {
        this.name = name;
        this.dob = dob;
        this.add = add;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Ho ten: " + name + ", Ngay sinh: " + dob + ", Dia chi: " + add + ", Gioi tinh: " + gender;
    }
   
    
}
