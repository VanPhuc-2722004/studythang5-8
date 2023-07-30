package onthang6;

public class main {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(0,0);
        PhanSo ps2 = new PhanSo(0,0);
        System.out.printf("nhap phan so thu nhat:");

        ps1.nhapTuSo();
        ps1.nhapMauSo();
        System.out.printf("nhap phan so thu hai:");
        ps2.nhapTuSo();
        ps2.nhapMauSo();
//        System.out.printf("tong hai phan so la:");
//        ps1.cong(ps2);````
//        ps1.inPhanSo();
//        System.out.printf("hieu hai phan so la:\n");
//        PhanSo a = ps1.tru(ps2);
//        a.inPhanSo();
//        System.out.printf("tich hai phan so la:\n");
//        PhanSo b = ps1.nhan(ps2);
//        b.inPhanSo();
//        System.out.printf("thuong hai phan so la:\n");
//        PhanSo c = ps1.chia(ps2);
//        c.inPhanSo();
//        PhanSo ps3 = BoXuLiPhanSo.nhan(ps1,ps2);
//        PhanSo.inPhanSo(ps3);

        Integer a = 1;
        int b = 1;


        //nguyên thủy truyền vaoaf hàm là tham trị
        // ko nguyên thủy truyền vào hàm là tham chiếu
        PhanSo ps3 = BoXuLiPhanSo.rutGon(ps2);
        ps3.inPso();

    }

}
