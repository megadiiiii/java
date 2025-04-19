/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package d10;

import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.util.*;

/**
 *
 * @author Mega.D
 */
public class QLCB {

    Scanner sc = new Scanner(System.in);
    ArrayList<Giangvien> list = new ArrayList<>();
    ArrayList<Giangvien> readlist = new ArrayList<>();

    public void add() {
        System.out.print("Ho ten: ");
        String hoTen = sc.nextLine();
        System.out.print("Ma GV: ");
        String maGiangVien = sc.nextLine();
        System.out.print("Dia chi: ");
        String diaChi = sc.nextLine();
        System.out.print("Gioi tinh: ");
        String gt = sc.nextLine();
        System.out.print("Khoa: ");
        String khoa = "";
        while (true) {
            System.out.println("Chon khoa: 1. DTVT, 2. CNTT, 3. HTTT, 4. CNM, 5. CNPM");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    khoa = "ĐTVT";
                    break;
                case 2:
                    khoa = "CNTT";
                    break;
                case 3:
                    khoa = "HTTT";
                    break;
                case 4:
                    khoa = "CNM";
                    break;
                case 5:
                    khoa = "CNPM";
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai");
                    break;
            }
            break;
        }

        Giangvien gv = new Giangvien(hoTen, maGiangVien, diaChi, gt, khoa);
        list.add(gv);
        writeFiles();
    }

    public void writeFiles() {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("Canbo.dat"));
            for (Giangvien gv : list) {
                bw.write(gv.getHoTen() + "|" + gv.getMaGiangVien() + "|" + gv.getDiaChi() + "|" + gv.getGt() + "|" + gv.getKhoa());
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            System.err.println("Da xay ra loi khi ghi file: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if(bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.getStackTrace();
                }
            }
        }
    }

    public void backup() {
        System.out.println("Nhap ten file backup: ");
        String backupPath = sc.nextLine();
        File source = new File("Canbo.dat");
        File backup = new File(backupPath);

        try {
            Files.copy(source.toPath(), backup.toPath());
            System.out.println("Backup thanh cong vao file: " + backupPath);

            if (source.delete()) {
                System.out.println("Xoa file goc thanh cong: Canbo.dat");
            } else {
                System.out.println("Khong the xoa file goc: Canbo.dat");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFiles() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.dat"));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] text = line.split("\\|");
                if (text.length == 5) {
                    String hoTen = text[0];
                    String maGiangVien = text[1];
                    String diaChi  = text[2];
                    String gt  = text[3];
                    String khoa  = text[4];
                    
                    Giangvien gv = new Giangvien(hoTen, maGiangVien, diaChi, gt, khoa);
                    readlist.add(gv);
                    System.out.println("Doc file thanh cong");
                    display();
                }
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
    
    public void display() {
        if(readlist.isEmpty()) {
            System.out.println("Empty");
        } else {
            for(Giangvien rl : readlist) {
                System.out.println(rl);
            }
        }
    }

    public static void main(String[] args) {
        QLCB ql = new QLCB();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("QLCB");
            System.out.println("1. Them can bo");
            System.out.println("2. Backup");
            System.out.println("3. Doc file");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    ql.add();
                    break;
                case 2:
                    ql.backup();
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
