package CauHoi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import java.util.Scanner;

enum doKho{
    easy,medium,hard
}
enum theLoai{
    toan,dovui,van;

    public void setTheLoai(theLoai valueOf) {
    }
}
public abstract class CauHoi {
    String noiDung;
    doKho doKho;
    theLoai theLoai;
    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public doKho getDoKho() {
        return doKho;
    }

    public void setDoKho(doKho doKho) {
        this.doKho = doKho;
    }

    public theLoai getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(theLoai theLoai) {
        this.theLoai = theLoai;
    }
    abstract void nhapCauhoi();

    void xuatCauHoi(){
    System.out.printf("%s\n",this.getNoiDung());
    System.out.printf("the loai la:%s\n",this.getTheLoai());
    System.out.printf("do kho la:%s\n",this.getDoKho());
}
abstract void nhapCauTraLoi();
abstract boolean testDungSai();
void xuatKetQua(){
    if(testDungSai()){
        System.out.printf("ban lam dung roi!\n");
    }else System.out.printf("ban lam sai roi!\n");
}
abstract ArrayList<CauHoi> docFileCauHoi();
}
