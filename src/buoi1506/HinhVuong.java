package buoi1506;

public class HinhVuong extends HinhChuNhat{

    HinhVuong(int canh){
        super(canh,canh);
    }
    int haiLanDienTich(){
        return getDienTich()*2;
    }
    int haiLanChuVi(){
        return getChuVi()*2;
    }
}
