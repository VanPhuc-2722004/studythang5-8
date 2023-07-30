package buoi2006.btvn2006.Khenthuong;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        final int a;
        SinhVien sv1 = new SinhVien("phuc","co",6);
        SinhVien sv2 = new SinhVien("lasd","co",9.1f);
        GiangVien gv1 = new GiangVien("sdaas",5,11);
        GiangVien gv2 = new GiangVien("sdasd",5,11);


        ArrayList<ConNguoi> mang1 = new ArrayList<ConNguoi>();
        mang1.add(sv1);
        mang1.add(sv2);
        mang1.add(gv1);
        mang1.add(gv2);
        for(int i =0 ; i < 4; i++){
            mang1.get(i).xetKhenThuong();
        }
    }
}
