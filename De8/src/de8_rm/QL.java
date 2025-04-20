/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package de8_rm;

import java.util.*;
import java.io.*;

public class QL {

    ArrayList<Number> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void add() {
        boolean isValid = false;
        int value, min, max;

        while (!isValid) {
            try {
                System.out.println("Min: ");
                min = sc.nextInt();
                System.out.println("Max: ");
                max = sc.nextInt();
                if (min >= max) {
                    System.out.println("Min phai < max");
                    break;
                }
                System.out.println("Value: ");
                value = sc.nextInt();
                if (value >= max || value <= min) {
                    System.out.println("Min phai < max");
                    break;
                }
                System.out.println("Success");
                list.add(new Number(value, min, max));
                isValid = true;
            } catch (InputMismatchException e) {
                e.getStackTrace();
            }
        }
    }

    public void display() {
        if (list.isEmpty()) {
            System.out.println("null");
        } else {
            for (Number nb : list) {
                if (nb.isPrime()) {
                    System.out.println(nb);
                }
            }
        }
    }

    public void writeFiles() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("number.txt"));
            for (Number nb : list) {
                if (nb.isPrime()) {
                    bw.write(nb.toString());
                    bw.newLine();
                }
            }
            bw.close();
            System.out.println("Ghi file thanh cong");
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public static void main(String[] args) {
        QL ql = new QL();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("MENU");
            System.out.println("1. Them number");
            System.out.println("2. Ghi file neu value la so nguyen to");
            System.out.println("3. Hien thi neu value la so nguyen to");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    ql.add();
                    break;
                case 2:
                    ql.writeFiles();
                    break;
                case 3:
                    ql.display();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    return;
                default:
                    System.out.println("Lua chon khong hop le");
                    break;
            }
        }
    }

}
