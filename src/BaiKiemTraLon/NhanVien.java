package BaiKiemTraLon;
enum KieuNhanVien{
    lauNam,thuctap,moiratruong 
}
public abstract class NhanVien{
    int id;
    String ten;
    int namSinh;
    int sdt;
    String email;
    KieuNhanVien kieuNhanVien;
    int soluongNhanVien = 0 ;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getNamSinh() {
        return namSinh;
    }
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public int getSdt() {
        return sdt;
    }
    public void setSdt(int sdt) {
        this.sdt = sdt;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public KieuNhanVien getKieuNhanVien() {
        return kieuNhanVien;
    }
    public void setKieuNhanVien(KieuNhanVien kieuNhanVien) {
        this.kieuNhanVien = kieuNhanVien;
    }
    void inThongTinNhanVien(){
        System.out.printf("anh/chi:%s\n",this.ten);
        System.out.printf("id:%d\n",this.id);
        System.out.printf("nam sinh:%d\n",this.namSinh);
        System.out.printf("so dien thoai:%d\n",this.sdt);
        System.out.printf("Email:%s\n",this.email);
    }
    abstract void nhapThongTinNhanVien();
}