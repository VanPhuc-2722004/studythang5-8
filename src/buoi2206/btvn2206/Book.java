package buoi2206.btvn2206;

import java.util.Scanner;

public class Book implements IBook {
    String tenSach;
    String theLoai;
    String tacGia;
    int giaBan;
    int idSach;

    Book() {
    }

    Book(String tenSach, String theLoai, String tacGia, int giaBan) {
        this.tenSach = tenSach;
        this.theLoai = theLoai;
        this.tacGia = tacGia;
        this.giaBan = giaBan;

    }

    String getTenSach() {
        return tenSach;
    }

    void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    String getTheLoai() {
        return theLoai;
    }

    void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    String getTacGia() {
        return tacGia;
    }

    void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    int getGiaBan() {
        return giaBan;
    }

    void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }
    public int getIdSach() {
        return idSach;
    }
    public void setIdSach(int idSach) {
        this.idSach = idSach;
    }
    public void nhapThongTinSach() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ten sach:\n");
        this.setTenSach(sc.nextLine());
        System.out.printf("nhap ten tac gia\n");
        this.setTacGia(sc.nextLine());
        System.out.printf("nhap the loai sach\n");
        this.setTheLoai(sc.nextLine());
        System.out.printf("nhap gia sach\n");
        this.setGiaBan(sc.nextInt());
        System.out.printf("nhap id cua sach\n");
        this.setIdSach(sc.nextInt());
    }

    public void XuatThongTinSach() {
        System.out.printf("\nten sach la:%s",this.getTenSach());
        System.out.printf("\nten tac gia la:%s",this.getTacGia());
        System.out.printf("\nthe loai la:%s",this.getTheLoai());
        System.out.printf("\ngia ban la:%d",this.getGiaBan());
        System.out.printf("\nID sach la:%d",this.getIdSach());
    }
}
