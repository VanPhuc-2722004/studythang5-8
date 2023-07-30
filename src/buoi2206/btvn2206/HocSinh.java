package buoi2206.btvn2206;

import java.util.Scanner;

public class HocSinh extends Person {
    String tenLop;
    float diemTrungBinh;

    HocSinh() {
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getTenLop() {
        return tenLop;
    }

    public float getDiemTrungBinh() { return diemTrungBinh; }

    @Override
    void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ten lop");
        this.setTenLop(sc.nextLine());
        System.out.printf("nhap diem trung binh");
        this.setDiemTrungBinh(sc.nextFloat());
    }

    void xuat() {
        super.xuat();
        System.out.printf("lop la:", this.getTenLop());
        System.out.printf("diem trung binh la:%f", this.getDiemTrungBinh());
    }

}
