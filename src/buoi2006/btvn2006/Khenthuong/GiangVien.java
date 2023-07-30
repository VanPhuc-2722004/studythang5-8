package buoi2006.btvn2006.Khenthuong;

import java.util.Scanner;

public class GiangVien extends GiaoVien{
    int soSVHD;
    GiangVien(){
    }
    GiangVien(String hoTen ,float diem ,int soSVHD){
        this.hoTen = hoTen;
        diemFeedBack = diem;
        this.soSVHD = soSVHD;
    }
    GiangVien(String hoTen , int soSVHD){
        this.hoTen = hoTen;
        this.soSVHD = soSVHD;
    }
    GiangVien(float diem , int soSVHD){
        diemFeedBack = diem;
        this.soSVHD = soSVHD;
    }
    GiangVien( int soSVHD){
        this.soSVHD = soSVHD;
    }
    void setSoSVHD(){
        Scanner sc = new Scanner(System.in);
        this.soSVHD = sc.nextInt();
    }
    @Override
    void xetKhenThuong(){
        if (this.soSVHD > 10 && this.diemFeedBack >= 4.5) System.out.printf("ong/ba %s:co khen thuong\n",this.hoTen);
        else System.out.printf("ong/ba %s:ko có khen thuong\n",this.hoTen);
    }
}
