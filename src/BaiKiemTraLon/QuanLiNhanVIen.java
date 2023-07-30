package BaiKiemTraLon;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiNhanVIen {
    static ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

    void menu() {
        try {
            int menu1;
            do {
                Scanner sc = new Scanner(System.in); 
                System.out.println("1. nhap thong tin nhan vien.");
                System.out.println("2. them nhan vien.");
                System.out.println("3. sua nhan vien.");
                System.out.println("4. xoa nhan vien.");
                System.out.println("5. danh sacch nhan vien lau nam.");
                System.out.println("6. danh sacch nhan vien moi ra truong.");
                System.out.println("7. danh sacch nhan vien thuc tap.");
                menu1 = sc.nextInt();
            } while (menu1 != 0);
        } catch (

        Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

    void themNhanVien() {
        int menu2;
        do {
            Scanner sc = new Scanner(System.in);
            menu2 = sc.nextInt();
            System.out.println("nhap kieu nhan vien:");
            System.out.println("1.Nhan vien lau nam.");
            System.out.println("2.Nhan vien moi ra truong.");
            System.out.println("3.Nhan vien thuc tap.");
            System.out.println("0.thoat.");
        } while (menu2 != 0);
        switch (menu2) {
            case 1:
                NhanVienLauNam nv = new NhanVienLauNam();
                nv.nhapThongTinNhanVien();
                nhapFileNhanVien(nv);
                break;
            case 2:
                NhanVienLauNam nv2 = new NhanVienLauNam();
                nv2.nhapThongTinNhanVien();
                nhapFileNhanVien(nv2);
                break;
            case 3:
                NhanVienLauNam nv3 = new NhanVienLauNam();
                nv3.nhapThongTinNhanVien();
                nhapFileNhanVien(nv3);
                break;
            case 0:
                System.out.println("da thoat!");
                break;
            default:
                System.out.println("nhap tu 0 - 3!!!");

        }
    }

    // void suaNhanVien(){
    // int idCanTim;
    // System.out.println("nhap id nhan vien can sua:");
    // Scanner sc = new Scanner(System.in);
    // idCanTim = sc.nextInt();
    // for(int i = 0; i < danhSachNhanVien.size(); i++){
    // if(danhSachNhanVien.get(i) == idCanTim){
    // danhSachNhanVien.get(i).nhapThongTinNhanVien();
    // }
    // }
    // }
    // void xoaNhanVien(){
    // int idCanTim;
    // System.out.println("nhap id nhan vien can sua:");
    // Scanner sc = new Scanner(System.in);
    // idCanTim = sc.nextInt();
    // for(int i = 0; i < danhSachNhanVien.size(); i++){
    // if(danhSachNhanVien.get(i) == idCanTim){
    // danhSachNhanVien.remove(i);
    // }
    // }
    // }
    void docFileNhanVien() {
    }

    public void nhapFileNhanVien(NhanVien nv) {
        try {
            FileWriter fw = new FileWriter("DanhSachNhanVien.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(nv.toString());
            bw.flush();
            bw.close();
            fw.close();

        } catch (Exception e) {
            System.out.printf("loi nhap file");
        }
    }
}
