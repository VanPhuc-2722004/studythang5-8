package buoi1506.btvn1506;

import java.util.Scanner;

public class Teacher extends HeThongQuanLiThongTin {
    String danhXung;
    Teacher(){
    }
    Teacher(String ten, String email,int tuoi, String danhXung){
        super(ten, email, tuoi);
        this.danhXung = danhXung;
    }
    String setDanhXung(){
        Scanner sc = new Scanner(System.in);
        this.danhXung = sc.nextLine();
        return this.danhXung;
    }
}
