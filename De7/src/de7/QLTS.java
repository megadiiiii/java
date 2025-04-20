/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package de7;

import java.util.*;
import java.io.*;

public class QLTS {

    ArrayList<Thisinh> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void add() {
        System.out.println("Nhap so luong thi sinh");
        int n = sc.nextInt();
        sc.nextLine();

        Thisinh ts = null;
        for (int i = 0; i < n; i++) {
            System.out.println("Thi sinh thu " + (i + 1) + ":");
            do {
                System.out.println("Chon khoi du thi: 1. Khoi A, 2. Khoi C");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        ts = new ThisinhKhoiA();
                        break;
                    case 2:
                        ts = new ThisinhKhoiC();
                        break;
                    default:
                        System.out.println("Lua chon khong hop le");
                        break;
                }
            } while (ts == null);
            ts.input(sc);
            list.add(ts);
        }
    }

    public void display() {
        System.out.println("DANH SACH THI SINH TRUNG TUYEN");
        boolean flag = false;
        for (Thisinh ts : list) {
            if (ts instanceof ThisinhKhoiA) {
                ThisinhKhoiA tsA = (ThisinhKhoiA) ts;
                if (tsA.getTotal() > 20) {
                    System.out.println(tsA);
                    flag = true;
                }
            } else if (ts instanceof ThisinhKhoiC) {
                ThisinhKhoiC tsC = (ThisinhKhoiC) ts;
                if (tsC.getTotal() > 20) {
                    System.out.println(tsC);
                    flag = true;
                }
            }
        }

        if (!flag) {
            System.out.println("Danh sach trong");
        }
    }

    public void writeFiles() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("thisinh.txt"));
            for (Thisinh ts : list) {
                if (ts instanceof ThisinhKhoiA) {
                    ThisinhKhoiA tsA = (ThisinhKhoiA) ts;
                    bw.write(tsA.toString());
                    bw.newLine();
                } else if (ts instanceof ThisinhKhoiC) {
                    ThisinhKhoiC tsC = (ThisinhKhoiC) ts;
                    bw.write(tsC.toString());
                    bw.newLine();
                }
            }
            bw.flush();
            System.out.println("Ghi file thanh cong.");
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLTS ql = new QLTS();
        while (true) {
            System.out.println("QUAN LY THI SINH");
            System.out.println("1. Nhap thong tin");
            System.out.println("2. Hien thi danh sach trung tuyen");
            System.out.println("3. Ghi toan bo thong tin thi sinh");
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
                case 3:
                    ql.writeFiles();
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
