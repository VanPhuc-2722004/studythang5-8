package buoi0607;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
    static float tongTienHocBong ;
    void xetHocBongId(){

    }
    void tinhTongSoTienHocBong(){
        int tongTienHocBong = 0;
        for (int i = 0 ; i <= HocSinh.danhSachHocSinh.size(); i++  ){
            if(HocSinh.danhSachHocSinh.get(i).getDiem() >= 8){
                this.tongTienHocBong += HocSinh.danhSachHocSinh.get(i).getTienHocBong();
            }
        }

    }
    static void menu() {
        int chon;
        do {
            System.out.printf("1. nhap thong tin sinh vien\n");
            System.out.printf("2. xet hoc bong theo id\n");
            System.out.printf("3. in ra tong so tien hoc bong can trao cho cac hoc sinh\n");
            System.out.printf("0. thoat");
            System.out.printf("chon:\n");
            Scanner sc = new Scanner(System.in);
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    int chon2;
                    do {
                        System.out.printf("chon he hoc sinh:");
                        System.out.printf("1.chinh quy");
                        System.out.printf("2.cu nhan");
                        System.out.printf("3.chat luong cao");
                        System.out.printf("0.thoat");
                        Scanner scanner = new Scanner(System.in);
                        chon2 = scanner.nextInt();
                        switch (chon2) {
                            case 1:
                                ChinhQuy hs = new ChinhQuy();
                                hs.nhapThongTinHocSinh();
                                hs.xetThuong();
                                HocSinh.danhSachHocSinh.add(hs);
                                break;
                            case 2:
                                CuNhan hs2 = new CuNhan();
                                hs2.nhapThongTinHocSinh();
                                hs2.xetThuong();
                                HocSinh.danhSachHocSinh.add(hs2);
                                break;
                            case 3:
                                ChatLuongCao hs3 = new ChatLuongCao();
                                hs3.nhapThongTinHocSinh();
                                hs3.xetThuong();
                                HocSinh.danhSachHocSinh.add(hs3);
                                break;
                        }
                    } while (chon2 != 0);
                    break;
                case 2:
                    break;
                case 3:
                    System.out.printf("tong so tien hoc bong la:%f\n",tongTienHocBong);
                    break;
                default:

            }
        } while (chon != 0);

    }
}
