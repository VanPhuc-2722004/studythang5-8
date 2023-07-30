package buoi1206.baitvn1206;

import java.util.Scanner;

public class SinhVien {
    static int soLuongSinhVien;
    private int diemToan;
    private int diemLy;
    private int diemHoa;


    SinhVien(){
        soLuongSinhVien++;
    }
    SinhVien(int diemToan, int diemLy, int diemHoa ){
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        soLuongSinhVien++;
    }
    public void setDiemToan(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap diem toan");
        this.diemToan = sc.nextInt();
    }
    public void setDiemLy(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap diem ly");
        this.diemLy = sc.nextInt();
    }
    public void setDiemHoa(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap diem hoa");
        this.diemHoa = sc.nextInt();
    }
    public float getDiemTb(){

        float diemTb = (this.diemToan + this.diemLy +this.diemHoa)/3;
        return  diemTb;
    }
    static void inSoLuongSv(){
        System.out.printf("so luong sinh vien la:%d",soLuongSinhVien);
    }
    void inDiemTb(){
        System.out.printf("diem trung binh la:%f",getDiemTb());
    }
}
