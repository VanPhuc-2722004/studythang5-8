package buoi2206.btvn2206;

import java.time.DateTimeException;
import java.util.Date;
import java.util.Scanner;

abstract public class Person {
    String hoTen;
    DateTimeException NgaySinh;
    String queQuan;
    Person(){
    }

    public String getHoTen() {
        return hoTen;
    }

    public DateTimeException getNgaySinh() {
        return NgaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(DateTimeException ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ho va ten");
        this.setHoTen(sc.nextLine());
        System.out.printf("nhap ngay sinh");

        System.out.printf("nhap que quan");
        setQueQuan(sc.nextLine());
    }
    void xuat(){
        System.out.printf("thong tin cua %s la:",this.getHoTen());
        System.out.printf("ngay thang nam sinh la:");
        System.out.printf("que la:%s",this.getQueQuan());

    }

}
