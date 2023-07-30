package buoi2206.btvn2206;

import java.util.ArrayList;
import java.util.Scanner;

public class BookList {
    static ArrayList<Book> BookList = new ArrayList<Book>();

    static void themSach() {
        Book bk1 = new Book();
        bk1.nhapThongTinSach();
        BookList.add(bk1);
    }

    static void themSach(Book bk) {
        BookList.add(bk);
    }

    static void xoaSach(Book bk1) {
        for (int i = 0; i < BookList.size(); i++) {
            if (bk1.idSach == BookList.get(i).idSach) {
                BookList.remove(i);
            }
        }

    }

    static void xoaSach() {
        int idXoa;
        System.out.printf("nhap id can xoa");
        Scanner sc = new Scanner(System.in);
        idXoa = sc.nextInt();
        for (int i = 0; i < BookList.size(); i++) {
            if (idXoa == BookList.get(i).idSach) {
                BookList.remove(i);
                System.out.printf("da xoa sach %s", BookList.get(i).tenSach);
            }
        }
    }

    static void suaThongTinSach(Book bk1) {
        for (int i = 0; i < BookList.size(); i++) {
            if (bk1.tenSach == BookList.get(i).tenSach) {
                BookList.get(i).nhapThongTinSach();
            }
        }
    }

    static void suaThongTinSachTheoTen() {
        String tenSua;
        System.out.printf("nhap ten sach can xoa");
        Scanner sc = new Scanner(System.in);
        tenSua = sc.nextLine();
        for (int i = 0; i < BookList.size(); i++) {
            if (tenSua == BookList.get(i).tenSach) {
                BookList.get(i).nhapThongTinSach();

            }
        }
    }
    static void timSachTheoTen() {
        String tenTim;
        System.out.printf("nhap ten sach can tim");
        Scanner sc = new Scanner(System.in);
        tenTim = sc.nextLine();
        for (int i = 0; i < BookList.size(); i++) {
            if (tenTim == BookList.get(i).tenSach) {
                BookList.get(i).XuatThongTinSach();
            }
        }
    }

    static void sapXepTuSachTangDan() {
        for (int i = 0; i <= BookList.size(); i++) {
            for (int j = 0; j <= BookList.size(); j++) {
                if (BookList.get(i).giaBan < BookList.get(j).giaBan) {
                    Book a;
                    a = BookList.get(i);
                    BookList.set(i, BookList.get(j));
                    BookList.set(j, a);
                }
            }
        }
    }

    static void sapXepTuSachGiamDan() {
        for (int i = 0; i <= BookList.size(); i++) {
            for (int j = 0; j <= BookList.size(); j++) {
                if (BookList.get(i).giaBan > BookList.get(j).giaBan) {
                    Book a;
                    a = BookList.get(i);
                    BookList.set(i, BookList.get(j));
                    BookList.set(j, a);
                }
            }
        }
    }

    static void xuatTuSach() {
        for (int i = 0; i < BookList.size(); i++) {
            BookList.get(i).XuatThongTinSach();
        }
    }

   static void menu() {
        int menu;
        do {
            System.out.printf("He thong sach\n");
            System.out.printf("1.them sach\n");
            System.out.printf("2.xoa sach theo id\n");
            System.out.printf("3.sua sach theo id\n");
            System.out.printf("4.tim sach theo ten\n");
            System.out.printf("5.in ra cac cuon sach\n");
            System.out.printf("0.thoat\n");
            System.out.printf("chon:\n");
            Scanner sc = new Scanner(System.in);
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    themSach();
                    break;
                case 2:
                    xoaSach();
                    break;
                case 3:
                    suaThongTinSachTheoTen();
                    break;
                case 4:
                    timSachTheoTen();
                    break;
                case 5:
                    int chon;
                    do{
                        System.out.printf("1.tang dan");
                        System.out.printf("2.giam dan");
                        System.out.printf("0.thoat");
                        Scanner scanner = new Scanner(System.in);
                        chon = scanner.nextInt();
                        switch (chon){
                            case 1:
                                sapXepTuSachTangDan();
                                xuatTuSach();
                            case 2:
                                sapXepTuSachGiamDan();
                                xuatTuSach();
                            case 0:
                                System.out.printf("da thoat\n");
                            default:
                                System.out.printf("chon tu 0 -2\n");
                        }
                    }while (chon != 0);
                    break;
                case 0:
                    System.out.printf("thoat\n");
                    break;
                default:
                    System.out.printf("nhap tu 1-6\n");
            }
        } while (menu != 0);

    }

}
