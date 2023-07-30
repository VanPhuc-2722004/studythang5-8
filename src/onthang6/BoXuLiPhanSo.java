package onthang6;

public class BoXuLiPhanSo {

    BoXuLiPhanSo(){

    }
    static PhanSo rutGon(PhanSo ps){
        int max = ps.tuSo;
        int uocChung = 1;
        if(ps.mauSo > ps.tuSo) {
            max = ps.mauSo;
        }
        for(int i = 2 ; i < max; i++){
            if(ps.tuSo % i == 0 && ps.mauSo % i == 0){
                uocChung = i;
            }
        }
        ps.tuSo %= uocChung;
        ps.mauSo %= uocChung;
        return ps;
    }
    static PhanSo cong(PhanSo ps1, PhanSo ps2){
        int tSo = (ps1.tuSo* ps2.mauSo) + (ps2.tuSo* ps1.mauSo);
        int mSo = ps1.mauSo* ps2.mauSo;
        PhanSo kq = new PhanSo();
        kq.tuSo = tSo;
        kq.mauSo = mSo;
        return kq;
    }
    static PhanSo tru(PhanSo ps1, PhanSo ps2){
        int tSo = (ps1.tuSo* ps2.mauSo) - (ps2.tuSo* ps1.mauSo);
        int mSo = ps1.mauSo* ps2.mauSo;
        PhanSo kq = new PhanSo();
        kq.tuSo = tSo;
        kq.mauSo = mSo;
        return kq;
    }
    static PhanSo nhan(PhanSo ps1, PhanSo ps2){
        int tSo = ps1.tuSo * ps2.tuSo;
        int mSo = ps1.mauSo * ps2.mauSo;
        PhanSo kq = new PhanSo();
        kq.tuSo = tSo;
        kq.mauSo = mSo;
        rutGon(kq);
        return kq;
    }
    static PhanSo chia(PhanSo ps1, PhanSo ps2){
        int tSo = ps1.tuSo * ps2.mauSo;
        int mSo = ps1.mauSo * ps2.tuSo;
        PhanSo kq = new PhanSo();
        kq.tuSo = tSo;
        kq.mauSo = mSo;
        return kq;
    }
    public void inPhanSo(PhanSo ps){
        System.out.printf("%d/%d",ps.tuSo,ps.mauSo);
    }


}
