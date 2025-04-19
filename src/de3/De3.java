/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package de3;

import java.io.*;
import java.util.*;

public class De3 {

    ArrayList<NhanVien> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    
        public void readFiles() {
            try {
            BufferedReader br = new BufferedReader(new FileReader("nhanvien.dat"));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] text = line.split("\\$");
                if (text.length == 8) {
                    String name = text[0];
                    String dob = text[1];
                    String add = text[2];
                    String gender = text[3];
                    String department = text[4];
                    double hsl = Double.parseDouble(text[5]);
                    int thamnien = Integer.parseInt(text[6]);
                    int lcb = Integer.parseInt(text[7]);

                    NhanVien nv = new NhanVien(name, dob, add, gender, department, hsl, thamnien, lcb);
                    list.add(nv);
                }
            }
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void display() {
        System.out.println("DANH SACH NHAN VIEN");
        if(list.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            for(NhanVien nv : list) {
                System.out.println(nv);
            }
        }
    }

    public static void main(String[] args) {
        De1 ql = new De1();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("QUAN LY NHAN VIEN");
            System.out.println("1. Doc file nhanvien.dat");
            System.out.println("2. Hien thi danh sach");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    ql.readFiles();
                    break;
                case 2:
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
