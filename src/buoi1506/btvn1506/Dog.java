package buoi1506.btvn1506;

public class Dog extends DongVat{
    private int duoi =1;
    Dog(int chan,int mat, int duoi ){
        super(chan,mat);
        this.chan = 4;
        this.duoi = duoi;
    }

    void inSoDuoi(){
        System.out.printf("so duoi la: %d",this.duoi);
    }
    void sua(){
        System.out.printf("dang sua");
    }
    void vayDuoi(){
        System.out.printf("dang vay duoi");
    }
}
