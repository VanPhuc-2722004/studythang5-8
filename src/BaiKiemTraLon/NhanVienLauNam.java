package BaiKiemTraLon;

import java.util.ArrayList;
import java.util.Scanner;

public class NhanVienLauNam extends NhanVien{
    int soNamKinhNghiem;
    String kiNangChuyenMon;
    ArrayList<NhanVien> danhSachNhanVienLauNam = new ArrayList<>();
    NhanVienLauNam(){
    }
    public int getSoNamKinhNghiem() {
        return soNamKinhNghiem;
    }
    public void setSoNamKinhNghiem(int soNamKinhNghiem) {
        this.soNamKinhNghiem = soNamKinhNghiem;
    }
    public String getKiNangChuyenMon() {
        return kiNangChuyenMon;
    }
    public void setKiNangChuyenMon(String kiNangChuyenMon) {
        this.kiNangChuyenMon = kiNangChuyenMon;
    }
    void inDanhSachNhanVienLauNam(){
    }
    @Override
    void nhapThongTinNhanVien(){
        Scanner sc = new Scanner(System.in);
        NhanVienLauNam nv = new NhanVienLauNam();
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
        nv.setKieuNhanVien(kieuNhanVien.lauNam);
        System.out.println("nhap so nam kinh nghiem nhan vien:\n");
        nv.soNamKinhNghiem = sc.nextInt();
        System.out.println("nhap ki năng chuyên mon nhan vien:\n");
        nv.kiNangChuyenMon = sc.nextLine();
        danhSachNhanVienLauNam.add(nv);
        QuanLiNhanVIen.danhSachNhanVien.add(nv);
    }
}
