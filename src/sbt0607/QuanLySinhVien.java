package sbt0607;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
    ArrayList<SinhVien> listSinhVien = new ArrayList<SinhVien>();

    void nhapSinhVien(){
        int menu;
        do{
            System.out.printf("moi chon he hoc sinh\n");
            System.out.printf("1. he chinh quy\n");
            System.out.printf("2. he tai nang\n");
            System.out.printf("3. he chat luong cao\n");
            Scanner sc = new Scanner(System.in);
            menu = sc.nextInt();
            switch (menu){
                case 1:
                    SinhVienChinhQuy sv1 = new SinhVienChinhQuy();
                    System.out.printf("\nnhap ten sinh vien:");
                    sv1.setTen(sc.next());
                    System.out.printf("\nnhap diem trung binh:");
                    sv1.setDiemTb(sc.nextInt());
                    listSinhVien.add(sv1);
                    break;
                case 2:
                    SinhVienTaiNang sv2 = new SinhVienTaiNang();
                    System.out.printf("\nnhap ten sinh vien");
                    sv2.setTen(sc.next());
                    System.out.printf("\nnhap diem trung binh:");
                    sv2.setDiemTb(sc.nextInt());
                    listSinhVien.add(sv2);
                    break;
                case 3:
                    SinhVienChatLuongCao sv3 = new SinhVienChatLuongCao();
                    System.out.printf("\nnhap ten sinh vien");
                    sv3.setTen(sc.next());
                    System.out.printf("\nnhap diem trung binh:");
                    sv3.setDiemTb(sc.nextInt());
                    listSinhVien.add(sv3);
                    break;
                case 0:
                    System.out.printf("da dung nhap sinh vien!");
                    break;
                default:
                    System.out.printf("chon tu 0 - 3");
            }
        }while (menu != 0);
    }
    int tinhTongSoTien(){
        int tongSoTien = 0 ;
        for(SinhVien sv : listSinhVien){
            tongSoTien += sv.TinhTienHocBong();
        }
        return tongSoTien;
    }

    void menu(){
        // hien thi menu
        int chon = 0;
        do {
            System.out.printf("1 . nhap danh sach sinh vien\n");
            System.out.printf("2 . tong so tien hoc bong la\n");
            System.out.printf("0 . thoat\n");
            System.out.printf("chon: ");
            Scanner scanner = new Scanner(System.in);
            chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    nhapSinhVien();
                    break;
                case 2:
                    int tongSoTien = tinhTongSoTien();
                    System.out.println(tongSoTien);
                    break;
                default:
                    System.out.printf("ban da thoat!");
                    break;
            }
        }while (chon != 0);
    }
}
