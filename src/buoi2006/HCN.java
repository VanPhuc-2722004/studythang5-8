package buoi2006;

import java.util.Scanner;

public class HCN extends Hinh{
    float canhDai;
    float canhRong;
    HCN(){

    }
    HCN(float canhDai, float canhRong){
        this.canhDai = canhDai;
        this.canhRong = canhRong;
    }
    void setCanhDai(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap canh dai:");
        this.canhDai = sc.nextFloat();
    }
    void setCanhRong(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap canh rong:");
        this.canhRong = sc.nextFloat();
    }
    @Override
    float tinhChuVi(){
        float cv = (canhDai + canhRong)*2;
        return cv;
    }
    float tinhDienTich(){
        float dt = canhDai * canhRong;
        return dt;
    }

}
