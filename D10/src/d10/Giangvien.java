/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package d10;

/**
 *
 * @author Mega.D
 */
public class Giangvien {
    private String hoTen;
    private String maGiangVien;
    private String diaChi;
    private String gt;
    private String khoa;

    public Giangvien() {
    }

    public Giangvien(String hoTen, String maGiangVien, String diaChi, String gt, String khoa) {
        this.hoTen = hoTen;
        this.maGiangVien = maGiangVien;
        this.diaChi = diaChi;
        this.gt = gt;
        this.khoa = khoa;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public void setMaGiangVien(String maGiangVien) {
        this.maGiangVien = maGiangVien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    @Override
    public String toString() {
        return "Ho ten:" + hoTen + ", Ma giang vien:" + maGiangVien + ", Dia chi:" + diaChi + ", Gioi tinh:" + gt + ", Khoa:" + khoa;
    }
    
    
    
}
