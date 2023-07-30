package CauHoi;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class NguoiChoi {
    private int diem;
    private String ten;

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }


    NguoiChoi(){
    }
    Scanner sc = new Scanner(System.in);

    void nhapTenNguoiChoi(){
        System.out.printf("ten nguoi choi la");
        this.ten = sc.nextLine();
    }
    static void nhapNguoiChoiVaoFile(NguoiChoi nc){
        try {
            FileWriter fw = new FileWriter("DanhSachNguoiChoi.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(nc.toString());
            bw.close();
            fw.close();

        }catch (Exception e){
            System.out.printf("loi nhap file");
        }
    }
    String toString1(){
        return ten + "\t" + diem; 
    }
}
