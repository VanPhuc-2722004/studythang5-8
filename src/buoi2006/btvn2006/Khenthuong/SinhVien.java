package buoi2006.btvn2006.Khenthuong;

public class SinhVien extends HocSinh{
    String nghienCuuKhoaHoc;

    SinhVien(){
    }
    SinhVien(String hoTen,String nghienCuuKhoaHoc , float dtb){
        this.hoTen = hoTen;
        this.nghienCuuKhoaHoc = nghienCuuKhoaHoc;
        this.dtb = dtb;

    }
    SinhVien(String nghienCuuKhoaHoc , float dtb){
        this.nghienCuuKhoaHoc = nghienCuuKhoaHoc;
        this.dtb = dtb;
    }
    @Override
    void xetKhenThuong(){
        if(this.nghienCuuKhoaHoc == "co" && dtb >= 9) System.out.printf("anh/chi %s:co khen thuong\n",this.hoTen);
        else System.out.printf("anh/chi %s:ko có khen thuong\n",this.hoTen);
    }
}
