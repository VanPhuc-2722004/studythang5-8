package buoi0607;

public class ChatLuongCao extends HocSinh{
    ChatLuongCao(){

    }
    @Override
    void xetThuong(){
        if(this.getDiem() >= 8){
            this.setTienHocBong(2000000);
        }
        else if(this.getDiem() >= 9){
            this.setTienHocBong(2500000);
        }
    }
}
