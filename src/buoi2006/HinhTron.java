package buoi2006;


import java.util.Scanner;

public class HinhTron extends Hinh{
    final float pi = 3.14f;
    int banKinh;
    HinhTron(){
    }
    HinhTron(int banKinh){
        this.banKinh = banKinh;
    }
    void setBanKinh(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ban kinh");
        this.banKinh = sc.nextInt();
    }


    @Override
    float tinhChuVi(){
        float cv = 2* pi * banKinh;
        return cv;
    }
    float tinhDienTich(){
        float dt =pi* banKinh *banKinh ;
        return dt;
    }

}
