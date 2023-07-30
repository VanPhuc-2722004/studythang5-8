package buoi0607;

public class CuNhan extends HocSinh{
    CuNhan(){
    }
    @Override
    void xetThuong(){
        if(this.getDiem() >= 8){
            this.setTienHocBong(1500000);
        }
        else if(this.getDiem() >= 9){
            this.setTienHocBong(2000000);
        }
    }
}
