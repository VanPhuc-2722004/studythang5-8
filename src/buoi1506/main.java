package buoi1506;

public class main {
    public static void main(String[] args) {
        HaiChieu m1 = new HaiChieu(2,3);
        BaChieu m2 = new BaChieu(m1,4);
        m1.inToaDo();
        m2.inToaDo();
    }
}
