package buoi0607;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class HocSinh {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;
    String ten;
    float diem;
    int tienHocBong;
    static ArrayList<HocSinh> danhSachHocSinh = new ArrayList();
    HocSinh(){
    }
    void setTen(String ten){
        this.ten = ten;
    }
    void setDiem(float diem){
        this.diem = diem;
    }
    String getTen(){
        return this.ten;
    }
    float getDiem(){
        return this.diem;
    }
    void setTienHocBong(int tienHocBong){
        this.tienHocBong = tienHocBong;
    }
    int getTienHocBong(){
        return this.tienHocBong;
    }

    void nhapThongTinHocSinh(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ten:");
        this.ten = sc.nextLine();
        System.out.printf("nhap diem");
        this.diem = sc.nextFloat();
        System.out.printf("nhap id ");
        this.id = sc.nextInt();
    }
    void xuatThongTinHocSinh(){
        System.out.printf("em %s co so diem la: %f",this.getTen(),this.getDiem());
    }
    abstract void xetThuong();
}
