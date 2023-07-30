package onthang6;

import java.util.Scanner;

public class PhanSo {

    int tuSo;
    int mauSo;
    PhanSo(){
    }

    PhanSo(int tuSo, int mauSo) {

        this.mauSo = mauSo;
        this.tuSo = tuSo;
    }
    int nhapTuSo(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap tu so:");
        this.tuSo = sc.nextInt();
       return tuSo;
    }
    int nhapMauSo(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap mau so:");
        this.mauSo = sc.nextInt();
        return mauSo;
    }

    static void inPhanSo(PhanSo ps){
        System.out.printf("%d/%d",ps.tuSo,ps.mauSo);
    }
//    PhanSo cong(PhanSo ps2){
//        this.tuSo = tuSo*ps2.mauSo+mauSo*ps2.tuSo;
//        this.mauSo = mauSo*ps2.mauSo;
//        return this;
//    }
//    PhanSo tru(PhanSo ps2){
//
//        int tuSo = (this.tuSo*ps2.mauSo)-(this.mauSo*ps2.tuSo);
//        int mauSo = (this.mauSo*ps2.mauSo);
//        PhanSo PSmoi = new PhanSo(tuSo,mauSo);
//        return PSmoi;
//    }
//
//
//    PhanSo nhan(PhanSo ps2){
//        int tSo = tuSo*ps2.tuSo;
//        int mSo = mauSo*ps2.mauSo;
//        PhanSo pSMoi = new PhanSo();
//        pSMoi.tuSo = tSo;
//        pSMoi.mauSo = mSo;
//        return pSMoi;
//    }
//    PhanSo chia(PhanSo ps2){
//        int tuSo = this.tuSo*ps2.mauSo;
//        int mauSo = this.mauSo*ps2.tuSo;
//        PhanSo pSMoi = new PhanSo();
//        pSMoi.tuSo = tuSo;
//        pSMoi.mauSo = mauSo;
//        return pSMoi;
//    }
    void inPso(){
        System.out.printf("%d/%d",tuSo,mauSo);
    }

}
