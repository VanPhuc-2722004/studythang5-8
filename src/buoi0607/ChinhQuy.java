package buoi0607;

public class ChinhQuy extends HocSinh{
    ChinhQuy(){

    }
    @Override
    void xetThuong(){
        if(this.getDiem() >= 8){
            this.setTienHocBong(1000000);
        }
        else if(this.getDiem() >= 9){
            this.setTienHocBong(1500000);
        }
    }
}
