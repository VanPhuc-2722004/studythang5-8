package buoi2006;

abstract public class Hinh {
    Hinh(){
    }
    abstract float tinhChuVi();
    abstract float tinhDienTich();
    void inChuVi(){
        System.out.printf("chu vi la :%f",tinhChuVi());
    }
    void inDienTich(){
        System.out.printf("dien tich la: %f",tinhDienTich());
    }
}
