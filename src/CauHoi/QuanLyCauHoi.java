package CauHoi;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCauHoi {
    void chucNangThi() {
        NguoiChoi nc = new NguoiChoi();
        nc.nhapTenNguoiChoi();
        for (int i = 0; i < QuanLyNguoiChoi.danhSachNguoiChoi.size(); i++) {

        }
    }

    int thiTracNghiem() {
        int diem = 0;
        CauHoiDungSai ch = new CauHoiDungSai();
        ArrayList<CauHoi> ds = ch.docFileCauHoi();
        for (CauHoi o : ds) {
            o.xuatCauHoi();
            o.nhapCauTraLoi();
            o.xuatKetQua();
            if (o.testDungSai())
                diem += 1;
        }
        return diem;
    }

    int thiTuluan() {
        CauHoiNgan ch = new CauHoiNgan();
        ArrayList<CauHoi> ds = ch.docFileCauHoi();
        int diem = 0;
        for (CauHoi o : ds) {
            o.xuatCauHoi();
            o.nhapCauTraLoi();
            if (o.testDungSai())
                diem += 1;
            o.xuatKetQua();
        }
        return diem;
    }

    void menu() {
        int menu;
        try {
            do {
                CauHoiNgan cauHoi = new CauHoiNgan();
                CauHoiDungSai ch3 = new CauHoiDungSai();
                System.out.printf("1. nhap cau hoi\n");
                System.out.printf("2. thi\n");
                System.out.printf("3. hien thi bang xep hang\n");
                System.out.printf("0 .thoat\n");
                System.out.printf("chon:");
                Scanner sc = new Scanner(System.in);
                menu = sc.nextInt();
                switch (menu) {
                    case 1:

                        int menu2;
                        try {
                            do {
                                System.out.printf("moi chon loai cau hoi\n");
                                System.out.printf("1. cau hoi dung sai\n");
                                System.out.printf("2. cau hoi ngan \n");
                                System.out.printf("0. thoat!\n");
                                menu2 = sc.nextInt();
                                switch (menu2) {
                                    case 1:
                                        CauHoiDungSai ch = new CauHoiDungSai();
                                        ch.nhapCauhoi();
                                        break;
                                    case 2:
                                        CauHoiNgan ch1 = new CauHoiNgan();
                                        ch1.nhapCauhoi();
                                        break;
                                    case 0:
                                        System.out.printf("ban da thoat.\n");
                                }
                            } while (menu2 != 0);
                            CauHoiDungSai ch1 = new CauHoiDungSai();
                            ch1.nhapCauHoiVaoFile();
                            CauHoiNgan ch = new CauHoiNgan();
                            ch.nhapCauHoiVaoFile();
                        } catch (Exception e) {
                            // TODO: handle exception
                        }

                        break;
                    case 2:
                        NguoiChoi nc = new NguoiChoi();
                        nc.nhapTenNguoiChoi();
                        int diemThi = 0;
                        int menu3;
                        do {
                            System.out.printf("1. thi\n");
                            System.out.printf("0. thoat!\n");
                            System.out.printf("moi chon\n");
                            menu3 = sc.nextInt();
                            switch (menu3) {
                                case 1:

                                    int menu4;
                                    try {
                                        do {
                                            System.out.println("1.thi tu luan\n");
                                            System.out.println("2.thi trac nghiem\n");
                                            System.out.println("0.thoat\n");
                                            System.out.println("chon:");
                                            menu4 = sc.nextInt();
                                            switch (menu4) {
                                                case 1:
                                                    thiTuluan();
                                                    int d = thiTuluan();
                                                    diemThi += d;
                                                    break;
                                                case 2:
                                                    thiTracNghiem();
                                                    int d2 = thiTracNghiem();
                                                    diemThi += d2;
                                                    break;
                                                default:
                                                    System.out.println("nhap 0-2");
                                            }

                                        } while (menu4 != 0);
                                        nc.setDiem(diemThi);
                                    } catch (Exception e) {
                                        // TODO: handle exception
                                    }

                                    break;
                                case 0:
                                    System.out.printf("ban da thoat.");
                            }
                        } while (menu3 != 0);
                }
            } while (menu != 0);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
