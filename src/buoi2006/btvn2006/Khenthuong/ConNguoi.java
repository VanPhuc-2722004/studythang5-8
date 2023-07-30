package buoi2006.btvn2006.Khenthuong;

import java.util.Scanner;

abstract public class ConNguoi {
    String hoTen;
    ConNguoi(){
    }
    void setHoTen(){
        Scanner sc = new Scanner(System.in);
        this.hoTen = sc.nextLine();
    }
    abstract void xetKhenThuong();
}
