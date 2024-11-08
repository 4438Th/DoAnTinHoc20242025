package Classes;

import java.time.*;

public class HangHoa {

    //Field
    private String maHH;
    private String tenHH;
    private LocalDate ngaySanXuat;//yyyy-MM-dd
    private int soLuong;
    private double giaTien;

    //Constructor
    public HangHoa() {
        this.maHH = null;
        this.tenHH = null;
        this.ngaySanXuat = null;
        this.soLuong = 0;
        this.giaTien = 0;
    }

    public HangHoa(String maHH, String tenHH, LocalDate ngaySanXuat, int soLuong, double giaTien) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.ngaySanXuat = ngaySanXuat;
        this.soLuong = soLuong;
        this.giaTien = giaTien;

    }

    //Property
    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

}
