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
public class SinhvienHTTT extends Sinhvien {
    private int hocphi;

    public SinhvienHTTT() {
    }


    public SinhvienHTTT(String id, String name, String dob, String gender, double gpa, int hocphi) {
        super(id, name, dob, gender, gpa);
        this.hocphi = hocphi;
    }

    public int getHocphi() {
        return hocphi;
    }

    public void setHocphi(int hocphi) {
        this.hocphi = hocphi;
    }

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.println("Hoc phi: ");
        hocphi = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", Hoc phi: " + hocphi; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toWriteFiles() {
        return super.toWriteFiles() + hocphi; 
        
    }
    
    
}
