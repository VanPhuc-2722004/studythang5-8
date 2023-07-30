package sbt0607;

public class SinhVienTaiNang extends SinhVien{
    @Override
    int TinhTienHocBong() {
        if(this.diemTb >= 9 && this.diemTb <=10){
            this.tienHocBong =2000000;
        }
        else if (this.diemTb >= 8){
            this.tienHocBong = 1500000;
        }
        return this.tienHocBong;
    }
}
