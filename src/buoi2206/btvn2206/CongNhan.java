package buoi2206.btvn2206;

import java.util.Scanner;

public class CongNhan extends Person{
    String ngheNghiep;
    int mucluong;
    CongNhan(){
    }

    public int getMucluong() {
        return mucluong;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setMucluong(int mucluong) {
        this.mucluong = mucluong;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    @Override
    void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap nghe nghiep:");
        this.setNgheNghiep(sc.nextLine());
        System.out.printf("nhap muc luong:");
        this.setMucluong(sc.nextInt());
    }
    void xuat() {
        super.xuat();
        System.out.printf("nghe nghiep la:%s",getHoTen());
        System.out.printf("muc luong la:%d dong");
    }
}
