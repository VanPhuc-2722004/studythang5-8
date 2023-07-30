package CauHoi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class QuanLyNguoiChoi {

    static ArrayList<NguoiChoi> danhSachNguoiChoi = new ArrayList<>();
    void nhapFileDanh() {
        try {
            FileReader fr = new FileReader("DanhSachCauHoiTracNghiem.txt");
            BufferedReader br = new BufferedReader(fr );
            String line = "";
            boolean kt = true;
            while(kt){
                line = br.readLine();
                if(line == "null"){
                    kt = false;
                }
                String txt[] = line.split("\\s+");
                if(txt[0] == "Cauhoitracnghiem"){
                    
                    String ten = txt[0];
                    int diem = Integer.parseInt(txt[1]);
                    danhSachNguoiChoi.add(new NguoiChoi());
                    System.out.println(line);
                }

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    void docFileCauHoi() {
        try {
            FileReader fr = new FileReader("DanhSachCauHoiTracNghiem.txt");
            BufferedReader br = new BufferedReader(fr );
            String line = "";
            boolean kt = true;
            while(kt){
                line = br.readLine();
                if(line == "null"){
                    kt = false;
                }
                String txt[] = line.split("\\s+");
                if(txt[0] == "Cauhoitracnghiem"){
                    
                    String ten = txt[0];
                    int diem = Integer.parseInt(txt[1]);
                    danhSachNguoiChoi.add(new NguoiChoi());
                    System.out.println(line);
                }

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
