package buoi1506.btvn1506;

public class Chicken extends DongVat{
    private int canh ;
    Chicken(int chan, int mat, int canh){
        super(chan,mat);
        this.chan = 2;
        this.canh = 2;
    }
    @Override
    void ngu(){
        System.out.printf("con ga dang ngu");
    }
    void bay(){
        System.out.printf("dang bay");
    }
    void vayCanh(){
        System.out.printf("sang vay canh");
    }
}
