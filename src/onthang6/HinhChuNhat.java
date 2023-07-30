
package onthang6;


public class HinhChuNhat {
    int chieudai;
    int chieurong;
    HinhChuNhat(int chieudai, int chieurong){
        this.chieudai= chieudai;
        this.chieurong= chieurong;
    }
    void inChuViHinhChuNhat(){
        System.out.print("chu vi la:"+((chieudai+chieurong)*2));
    }
    void inDienTichHinhChuNhat(){
        System.out.print("chu vi la:"+(chieudai*chieurong));
    }
}
