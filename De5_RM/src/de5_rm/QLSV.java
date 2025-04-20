/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package de5_rm;

import java.util.*;
import java.io.*;

public class QLSV {

    Scanner sc = new Scanner(System.in);
    ArrayList<Sinhvien> list = new ArrayList<>();

    public void add() {
        Sinhvien sv = null;
        do {
            System.out.println("Chon loai SV: 1. SVUTT, 2. SVHTTT");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    sv = new SinhvienUTT();
                    break;
                case 2:
                    sv = new SinhvienHTTT();
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
                    continue;
            }
        } while (sv == null);

        sv.input(sc);
        list.add(sv);
        writeFiles(sv);
    }

    public void writeFiles(Sinhvien sv) {
        String file_name = "";
        if (sv instanceof SinhvienUTT) {
            file_name = "svutt.dat";
        } else if (sv instanceof SinhvienHTTT) {
            file_name = "svhttt.dat";
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file_name));
            bw.write(sv.toWriteFiles());
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public void display() {
        System.out.println("DANH SACH SINH VIEN");
        if (list.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            for (Sinhvien sv : list) {
                System.out.println(sv);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLSV ql = new QLSV();
        while (true) {
            System.out.println("QUAN LY SINH VIEN");
            System.out.println("1. Them SV");
            System.out.println("2. Hien thi danh sach SV");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    ql.add();
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
