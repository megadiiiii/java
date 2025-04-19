/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package d10_rm;

import java.io.*;
import java.util.*;
import java.nio.*;
import java.nio.file.Files;

public class D10_RM {

    Scanner sc = new Scanner(System.in);
    ArrayList<Giangvien> list = new ArrayList<>();
    ArrayList<Giangvien> readlist = new ArrayList<>();

    public void add() {
        System.out.print("Ten: ");
        String name = sc.nextLine();
        System.out.print("Ma GV: ");
        String id = sc.nextLine();
        System.out.print("Dia chi: ");
        String add = sc.nextLine();
        System.out.print("Gioi tinh: ");
        String gender = sc.nextLine();
        System.out.print("Khoa: ");
        String department = "";
        while (true) {
            System.out.print("Chon khoa (1. DTVT, 2, CNTT, 3. HTTT, 4. CNM, 5. CNPM): ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    department = "DTVT";
                    break;
                case 2:
                    department = "CNTT";
                    break;
                case 3:
                    department = "HTTT";
                    break;
                case 4:
                    department = "CNM";
                    break;
                case 5:
                    department = "CNPM";
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
                    break;
            }
            break;
        }
        Giangvien gv = new Giangvien(name, id, add, gender, department);
        list.add(gv);
        writeFiles();
    }

    public void writeFiles() {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("Canbo.dat"));
            for (Giangvien gv : list) {
                bw.write(gv.getId() + "|" + gv.getName() + "|" + gv.getAdd() + "|" + gv.getGender() + "|" + gv.getDepartment());
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

    public void backup() {
        System.out.print("Nhap ten file backup: ");
        String backupPath = sc.nextLine();

        File source = new File("Canbo.dat");
        File backup = new File(backupPath);

        try {
            Files.copy(source.toPath(), backup.toPath());
            System.out.println("Backup thanh cong tai: " + backupPath);
            if (source.delete()) {
                System.out.println("Da xoa thanh cong file: Canbo.dat");
            } else {
                System.out.println("Khong the xoa file: Canbo.dat");
            }
        } catch (IOException e) {
            e.getStackTrace()
        }
    }
    
    public void readFiles() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.dat"));
            String line = "";
            while((line = br.readLine()) != null) {
                String[] text = line.split("\\|");
                String name = text[0];
                String id = text[1];
                String add = text[2];
                String gender = text[3];
                String department = text[4];
                
                
                Giangvien gv = new Giangvien(name, id, add, gender, department);
                readlist.add(gv);
                System.out.println("Doc file thanh cong");
                display();
            }
        } catch (FileNotFoundException e) {
            e.getStackTrace()
        } catch (Exception e) {
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
        Scanner sc = new Scanner(System.in);
        D10_RM ql = new D10_RM();
        while (true) {
            System.out.println("QUAN LY CAN BO");
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
                    System.out.println("Lua chon khong hop le");
                    continue;
            }
        }
    }

}
