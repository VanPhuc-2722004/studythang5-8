package buoi2006.btvn2006.Khenthuong;

import java.util.Scanner;

public class GiaoVien extends ConNguoi{
    float diemFeedBack;
    GiaoVien(){
    }
    GiaoVien(String hoTen ,float diem ){
        this.hoTen = hoTen;
        diemFeedBack = diem;
    }
    GiaoVien(String hoTen  ){
        this.hoTen = hoTen;
    }
    GiaoVien(float diem ){
        diemFeedBack = diem;
    }
    void setDiemFeedBack(){
        Scanner sc = new Scanner(System.in);
        this.diemFeedBack = sc.nextInt();
    }
    @Override
    void xetKhenThuong(){
        if(this.diemFeedBack >= 4.5)  System.out.printf("ong/ba %s:co khen thuong\n",this.hoTen);
        else System.out.printf("ong/ba %s:ko có khen thuong\n",this.hoTen);
    }
}
