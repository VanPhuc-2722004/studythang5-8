package buoi1206.baitvn1206;

public class ConNguoi {
    private String ten;
    private int tuoi;
    ConNguoi(String ten , int tuoi){
        this.ten = ten;
        if(tuoi > 0 && tuoi <= 100) this.tuoi = tuoi;
    }
     void inThongTin(){
        System.out.printf("ten la:%s",this.ten);
        if (this.tuoi > 0) System.out.printf("tuoi la:%d",this.tuoi);
        else System.out.printf("tuoi khong hop le");
    }
    void soSanhTuoi(ConNguoi cn2){
        if(this.tuoi > cn2.tuoi) System.out.printf("tuoi cua %s lon hon cua %s",this.ten,cn2.ten);
        else if(this.tuoi < cn2.tuoi) System.out.printf("tuoi cua %s lon hon cua %s",cn2.ten,this.ten);
        else System.out.printf("tuoi bang nhau");
    }

}
