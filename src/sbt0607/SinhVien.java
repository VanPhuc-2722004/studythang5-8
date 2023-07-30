package sbt0607;
public abstract class SinhVien {
    String ten;
    int diemTb;
    int tienHocBong;
    void setTienHocBong(int tienHocBong) {
        this.tienHocBong = tienHocBong;
    }
    public void setDiemTb(int diemTb) {
        this.diemTb = diemTb;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    abstract int TinhTienHocBong();
}
