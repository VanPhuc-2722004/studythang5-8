package buoi2006.btvn2006.Khenthuong;

import java.util.Scanner;

public class HocSinh extends ConNguoi{
    float dtb;
    HocSinh(){
    }
    HocSinh(int dtb){
        this.dtb = dtb;
    }
    void setDtb(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap diem trung binh");
    }
    @Override
    void xetKhenThuong(){
        if (this.dtb >= 9) System.out.printf("anh/chi %s:co khen thuong \n",this.hoTen);
        else System.out.printf("anh/chi %s:ko có khen thuong\n",this.hoTen);
    }

}
