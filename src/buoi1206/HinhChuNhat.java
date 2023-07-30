package buoi1206;

public class HinhChuNhat {
    private int canhDai;
    private int canhNgan;
    HinhChuNhat(int canhDai, int canhNgan){
        this.canhDai = canhDai;
        this.canhNgan = canhNgan;
    }

    public int getChuVi(){
        int chuVi = (this.canhDai + this.canhNgan)*2;
        return chuVi;
    }
    public int getDienTich(){
        int dienTich= (this.canhDai * this.canhNgan);
        return dienTich;
    }
    void inChuVi(){
        System.out.printf("chu vi la:%d",getChuVi());
    }
    void inDienTich(){
        System.out.printf("dien tich la:%d",getDienTich());
    }

}
