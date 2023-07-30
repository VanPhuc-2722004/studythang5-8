package CauHoi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CauHoiNgan extends CauHoi {
    private String dapAn;
    private String traLoi;
    static ArrayList<CauHoiNgan> danhSachCauHoiNgan = new ArrayList<>();

    CauHoiNgan(String noidung, String theloai, String dokho, String dapan) {
        this.noiDung = noidung;
        this.theLoai = theLoai.valueOf(theloai);
        this.doKho = doKho.valueOf(dokho);
        this.dapAn = dapan;
    }

    CauHoiNgan() {
    }

    public String getDapAn() {
        return dapAn;
    }

    public void setDapAn(String dapAn) {
        this.dapAn = dapAn;
    }

    public String getTraLoi() {
        return traLoi;
    }

    public void setTraLoi(String traLoi) {
        this.traLoi = traLoi;
    }

    Scanner sc = new Scanner(System.in);

    @Override
    void nhapCauhoi() {
        CauHoiNgan ch1 = new CauHoiNgan();
        System.out.printf("nhap cau hoi:");
        ch1.setNoiDung(sc.nextLine());
        System.out.printf("nhap the loai:");
        String tl;
        tl = sc.nextLine();
        ch1.setTheLoai(theLoai.valueOf(tl));
        System.out.printf("nhap do kho:");
        String dk;
        dk = sc.nextLine();
        ch1.setDoKho(doKho.valueOf(dk));
        System.out.println("nhap dap an:");
        ch1.setDapAn(sc.nextLine());
        danhSachCauHoiNgan.add(ch1);
    }

    void xuatCauHoi() {
        super.xuatCauHoi();
    }

    void nhapCauTraLoi() {
        System.out.printf("nhap cau tra loi");
        this.setTraLoi(sc.nextLine());
    }

    @Override
    boolean testDungSai() {

        if (this.getDapAn() == this.getTraLoi()) {
            return true;
        }
        return false;
    }
    void nhapCauHoiVaoFile() {
        ArrayList<CauHoi> dstv = new ArrayList<>();
        try {
            FileWriter fw = new FileWriter("DanhSachCauHoiNgan.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (CauHoiNgan ch : danhSachCauHoiNgan) {
                bw.write(ch.toString1());
                bw.newLine();
            }
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    ArrayList<CauHoi> docFileCauHoi() {
        ArrayList<CauHoi> dstv = new ArrayList<>();
        try {
            FileReader fr = new FileReader("DanhSachCauHoiNgan.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            boolean kt = true;
            while (kt) {
                line = br.readLine();
                if (line == "null") {
                    kt = false;
                }
                String txt[] = line.split("\\;");
                String noiDung = txt[0];
                String theLoai = txt[1];
                String doKho = txt[2];
                String dapAn = txt[3];
                dstv.add(new CauHoiNgan(noiDung, theLoai, doKho, dapAn));
                System.out.println(line);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return dstv;
    }

    String toString1() {
        return noiDung + ";" + theLoai + ";" + doKho + ";" + dapAn;
    }
}
