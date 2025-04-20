/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package de4;

import java.util.*;
import java.io.*;

public class QLSV {

    ArrayList<Student> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void readFiles() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("sinhvien.dat"));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] part = line.split("\\$");
                if (part.length == 7) {
                    String name = part[0];
                    String dob = part[1];
                    String add = part[2];
                    String gender = part[3];
                    String id = part[4];
                    String email = part[5];
                    double gpa = Double.parseDouble(part[6]);

                    Student st = new Student(name, id, add, gender, id, email, gpa);
                    list.add(st);
                }
            }
            System.out.println("Doc file thanh cong");
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void display() {
        System.out.println("DANH SACH SINH VIEN");
        if (list.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            for (Student st : list) {
                System.out.println(st);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLSV ql = new QLSV();
        while (true) {
            System.out.println("QUAN LY SINH VIEN");
            System.out.println("1. Doc file sinhvien.dat");
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
