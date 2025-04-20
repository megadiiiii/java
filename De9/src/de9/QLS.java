/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package de9;

import java.util.*;
import java.io.*;
import java.nio.file.Files;

public class QLS {

    ArrayList<Book> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void add() {
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Authors: ");
        String authors = sc.nextLine();
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Category: 1. Tap chi, 2. KHXH, 3. KHTN, 4. Luan van: ");
        String category = "";
        while (true) {
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    category = "Tap chi";
                    break;
                case 2:
                    category = "KHXH";
                    break;
                case 3:
                    category = "KHTN";
                    break;
                case 4:
                    category = "Luan van";
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai");
                    break;
            }
            break;
        }
        Book book = new Book(id, authors, title, category);
        list.add(book);
        writeFiles();
    }

    public void writeFiles() {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("books.dat"));
            bw.write("ID, Authors, Title, Category");
            bw.newLine();
            for (Book book : list) {
                bw.write(book.getId() + ", " + book.getAuthors() + ", " + book.getTitle() + ", " + book.getCategory());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public void backup() {
        System.out.print("Nhap ten file backup: ");
        String backupPath = sc.nextLine();

        File source = new File("books.dat");
        File backup = new File(backupPath);

        try {
            Files.copy(source.toPath(), backup.toPath());
            System.out.println("Backup file thanh cong: " + backupPath);
            if (source.delete()) {
                System.out.println("Da xoa file: books.dat");
            } else {
                System.out.println("Khong the xoa file: books.dat");
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLS ql = new QLS();
        while (true) {
            System.out.println("QUAN LY SACH");
            System.out.println("1. Them sach");
            System.out.println("2. Backup file");
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
