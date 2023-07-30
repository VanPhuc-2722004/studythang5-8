package BaiKiemTraLon;

import java.util.ArrayList;
import java.util.Scanner;

enum XepLoaiTotNghiep{
    yeu,kha,gioi
}
public class NhanVienMoiRaTruong extends NhanVien{
    int thoiGianTotNghiep;
    XepLoaiTotNghiep xepLoaiTotNghiep;
    String truongTotNghiep;
    ArrayList<NhanVien> danhSachNhanVienMoiRaTruong = new ArrayList<>();
    NhanVienMoiRaTruong(){
    }
    public int getThoiGianTotNghiep() {
        return thoiGianTotNghiep;
    }
    public void setThoiGianTotNghiep(int thoiGianTotNghiep) {
        this.thoiGianTotNghiep = thoiGianTotNghiep;
    }
    public XepLoaiTotNghiep getXepLoaiTotNghiep() {
        return xepLoaiTotNghiep;
    }
    public void setXepLoaiTotNghiep(XepLoaiTotNghiep xepLoaiTotNghiep) {
        this.xepLoaiTotNghiep = xepLoaiTotNghiep;
    }
    public String getTruongTotNghiep() {
        return truongTotNghiep;
    }
    public void setTruongTotNghiep(String truongTotNghiep) {
        this.truongTotNghiep = truongTotNghiep;
    }
    void inDanhSachSinhVienMoiRaTruong(){
    }
    @Override
    void nhapThongTinNhanVien(){
        Scanner sc = new Scanner(System.in);
        NhanVienMoiRaTruong nv = new NhanVienMoiRaTruong();
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
        nv.setKieuNhanVien(kieuNhanVien.moiratruong);
        System.out.println("nhap thoi gian tot nghiep:\n");
        nv.thoiGianTotNghiep = sc.nextInt();
        System.out.println("nhap truong tot nghiep:\n");
        nv.truongTotNghiep = sc.nextLine();
        danhSachNhanVienMoiRaTruong.add(nv);
        QuanLiNhanVIen.danhSachNhanVien.add(nv);
    } 
}
