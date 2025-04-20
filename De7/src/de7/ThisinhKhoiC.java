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
public class ThisinhKhoiC extends Thisinh {
    private double Van;
    private double Su;
    private double Dia;

    public ThisinhKhoiC() {
    }

    public ThisinhKhoiC(String name, String dob, String add, double Van, double Su, double Dia) {
        super(name, dob, add);
        this.Van = Van;
        this.Su = Su;
        this.Dia = Dia;
    }

    public double getVan() {
        return Van;
    }

    public void setVan(double Van) {
        this.Van = Van;
    }

    public double getSu() {
        return Su;
    }

    public void setSu(double Su) {
        this.Su = Su;
    }

    public double getDia() {
        return Dia;
    }

    public void setDia(double Dia) {
        this.Dia = Dia;
    }

    @Override
    public String toString() {
        return super.toString() + ", Van: " + Van + ", Su: " + Su + ", Dia: " + Dia + ", Hoa: " + getTotal();
    }
    
    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Van: ");
        Van = sc.nextDouble();
        System.out.print("Su: ");
        Su = sc.nextDouble();
        System.out.print("Dia: ");
        Dia = sc.nextDouble();
        sc.nextLine();
    }  
    
    public double getTotal() {
        return Van + Su + Dia;
    }
}
