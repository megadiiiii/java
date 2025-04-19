/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package d10_rm;

/**
 *
 * @author Mega.D
 */
public class Giangvien {

    private String name;
    private String id;
    private String add;
    private String gender;
    private String department;

    public Giangvien() {
    }

    public Giangvien(String name, String id, String add, String gender, String department) {
        this.name = name;
        this.id = id;
        this.add = add;
        this.gender = gender;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Giangvien{" + "name=" + name + ", id=" + id + ", add=" + add + ", gender=" + gender + ", department=" + department + '}';
    }

    
    
}
