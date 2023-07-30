package buoi1506;

public class BaChieu extends HaiChieu{
    int z;
    BaChieu(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    BaChieu(HaiChieu hc, int z){
        super(hc.x, hc.y);
        this.z = z;
    }


    void inToaDo() {
        System.out.printf("toa do ba chieu la:%d,%d,%d",this.x,this.y,this.z);
    }
}
