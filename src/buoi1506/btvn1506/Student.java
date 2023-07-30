package buoi1506.btvn1506;

public class Student extends HeThongQuanLiThongTin {
    int gpa;
    Student(){
    }
    Student(String ten, String email, int tuoi, int gpa ){
        super(ten, email, tuoi);
        this.gpa = gpa;
    }
    void guiThongBaoQuaMon(){
        if(this.gpa>= 5) System.out.printf("chúc mung ban da Squa mon");
        else System.out.printf("ban phai hoc lai roi:))");
    }
}
