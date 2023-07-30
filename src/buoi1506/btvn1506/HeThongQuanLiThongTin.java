package buoi1506.btvn1506;

import java.util.Scanner;

public class HeThongQuanLiThongTin {
    String ten;
    String email;
    int tuoi;
    HeThongQuanLiThongTin(){

    }
    HeThongQuanLiThongTin(String ten,String email,int tuoi){
        this.ten = ten;
        this.tuoi = tuoi;
        this.email = email;
    }


    String getTen(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ten:");
        this.ten = sc.nextLine();
        return this.ten;
    }
    String getEmail(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap email:");
        this.email = sc.nextLine();
        return this.email;
    }
    int getTuoi(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap tuoi:");
        this.tuoi = sc.nextInt();
        return this.tuoi;
    }
    void guiThongBao(){
        System.out.printf("chao ban %s",this.ten);
    }
}
