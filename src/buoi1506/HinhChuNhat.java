package buoi1506;

public class HinhChuNhat {
    int canhDai;
    int canhRong;
    HinhChuNhat (int canhDai,int canhRong){
            this.canhDai = canhDai;
            this.canhRong = canhRong;
    }

    public int getChuVi(){
        int cv = 0;
        cv = (this.canhDai + this.canhRong) *2;
        return cv;
    }
    public int getDienTich(){
        int dt = 0;
        dt = (this.canhDai *this.canhRong);
        return dt;
    }
    void intDienTich(){
        System.out.printf("dien tich la:%d",getDienTich());
    }
    void intCHuVi(){
        System.out.printf("dien tich la:%d",getChuVi());
    }
}
