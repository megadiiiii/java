/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de7;

import java.util.Scanner;

/**
 *
 * @author Mega.D
 */
public class ThisinhKhoiA extends Thisinh {
    private double Toan;
    private double Ly;
    private double Hoa;

    public ThisinhKhoiA() {
    }

    public ThisinhKhoiA(String name, String dob, String add, double Toan, double Ly, double Hoa) {
        super(name, dob, add);
        this.Toan = Toan;
        this.Ly = Ly;
        this.Hoa = Hoa;
    }

    public double getToan() {
        return Toan;
    }

    public void setToan(double Toan) {
        this.Toan = Toan;
    }

    public double getLy() {
        return Ly;
    }

    public void setLy(double Ly) {
        this.Ly = Ly;
    }

    public double getHoa() {
        return Hoa;
    }

    public void setHoa(double Hoa) {
        this.Hoa = Hoa;
    }

    @Override
    public String toString() {
        return super.toString() + ", Toan: " + Toan + ", Ly: " + Ly + ", Hoa: " + Hoa + ", Tong diem: " + getTotal();
    }
    
    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Toan: ");
        Toan = sc.nextDouble();
        System.out.print("Ly: ");
        Ly = sc.nextDouble();
        System.out.print("Hoa: ");
        Hoa = sc.nextDouble();
        sc.nextLine();
    }  
    
    public double getTotal() {
        return Toan + Ly + Hoa;
    }
}
