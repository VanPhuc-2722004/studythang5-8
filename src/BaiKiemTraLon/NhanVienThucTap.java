package BaiKiemTraLon;

import java.util.ArrayList;
import java.util.Scanner;

public class NhanVienThucTap extends NhanVien{
    String chuyenNganh;
    int hocKi;
    String truong;
    ArrayList<NhanVien> danhSachNhanVienThucTap = new ArrayList<>();
    NhanVienThucTap(){
    }
    public String getChuyenNganh() {
        return chuyenNganh;
    }
    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    public int getHocKi() {
        return hocKi;
    }
    public void setHocKi(int hocKi) {
        this.hocKi = hocKi;
    }
    public String getTruong() {
        return truong;
    }
    public void setTruong(String truong) {
        this.truong = truong;
    }
    void inDanhSachSinhVienThucTap(){
    }
    @Override
    void nhapThongTinNhanVien(){
        Scanner sc = new Scanner(System.in);
        NhanVienThucTap nv = new NhanVienThucTap();
        System.out.println("nhap ten nhan vien:\n");
        nv.ten = sc.nextLine();
        System.out.println("nhap tuoi nhan vien:\n");
        nv.namSinh = sc.nextInt();
        System.out.println("nhap id nhan vien:\n");
        nv.id = sc.nextInt();
        System.out.println("nhap nam sinh nhan vien:\n");
        nv.namSinh = sc.nextInt();
        System.out.println("nhap sdt nhan vien:\n");
        nv.sdt = sc.nextInt();
        System.out.println("nhap emai nhan vien:\n");
        nv.email = sc.nextLine();
        nv.setKieuNhanVien(kieuNhanVien.thuctap);
        System.out.println("nhap hoc ki dang hoc:\n");
        nv.hocKi = sc.nextInt();
        System.out.println("nhap chuyen nghanh dang hoc:\n");
        nv.chuyenNganh = sc.nextLine();
        System.out.println("nhap truong dang hoc:\n");
        nv.truong = sc.nextLine();
        danhSachNhanVienThucTap.add(nv);
        QuanLiNhanVIen.danhSachNhanVien.add(nv);
    }
}
