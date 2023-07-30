package buoi2006;

import java.util.Scanner;

public class HinhVuong extends Hinh {
    float canh;
    HinhVuong(){

    }
    HinhVuong(float canh){
        this.canh = canh;
    }
    void setCanh(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap canh:");
        this.canh = sc.nextFloat();
    }
    @Override
    float tinhChuVi(){
        float cv = canh * 4;
        return cv;
    }
    float tinhDienTich(){
        float dt = canh * canh;
        return dt;
    }

}
