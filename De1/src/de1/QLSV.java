/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package de1;

import java.io.*;
import java.util.*;

public class QLSV {

    Scanner sc = new Scanner(System.in);
    ArrayList<Student> list = new ArrayList<>();
    ArrayList<Student> readlist = new ArrayList<>();

    public void add() {
        System.out.print("Ten: ");
        String name = sc.nextLine();
        System.out.print("Ngay sinh: ");
        String dob = sc.nextLine();
        System.out.print("Dia chi: ");
        String add = sc.nextLine();
        System.out.print("Gioi tinh: ");
        String gender = sc.nextLine();
        System.out.print("Ma SV: ");
        String id = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Diem tong ket: ");
        double gpa = sc.nextDouble();
        sc.nextLine();

        Student st = new Student(name, dob, add, gender, id, email, gpa);
        list.add(st);
    }

    public void writeFiles() {
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("E:\\IS\\Java\\OOP\\sinhvien.dat"));
            // Thay E:\\IS\\Java\\OOP\\sinhvien.dat bang dia chi can luu
            for (Student st : list) {
                bw.write(st.getName() + "|" + st.getDob() + "|" + st.getAdd() + "|" + st.getGender() + "|" + st.getId() + "|" + st.getEmail() + "|" + st.getGpa());
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.getStackTrace();
                }
            }
        }
    }

    public void readFiles() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("sinhvien.dat"));
            //Ten file can doc: sinhvien.dat
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] part = line.split("\\|");
                if (part.length == 7) {
                    String name = part[0];
                    String dob = part[1];
                    String add = part[2];
                    String gender = part[3];
                    String id = part[4];
                    String email = part[5];
                    double gpa = Double.parseDouble(part[6]);
                    
                    Student st = new Student(name, dob, add, gender, id, email, gpa);
                    readlist.add(st);
                    display();
                }
            }
            System.out.println("Doc file sinh vien.dat thanh cong");
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    
    public void display() {
        System.out.println("DANH SACH SINH VIEN");
        if(readlist.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            for(Student rl : readlist) {
                System.out.println(rl);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLSV ql = new QLSV();
        while (true) {
            System.out.println("QLSV");
            System.out.println("1. Them SV");
            System.out.println("2. Luu file sinhvien.dat");
            System.out.println("3. Doc file sinhvien.dat");
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
                    ql.readFiles();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    return;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai");
                    break;
            }
        }
    }

}
