package CauHoi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CauHoiDungSai extends CauHoi {
    private boolean dapAn;
    private boolean traLoi;
    static ArrayList<CauHoiDungSai> danhsachcauhoitracnghiem = new ArrayList<>();

    CauHoiDungSai() {
    }

    CauHoiDungSai(String nd, String tl, String dk, String da) {
        this.noiDung = nd;
        this.setTheLoai(theLoai.valueOf(tl));
        this.setDoKho(doKho.valueOf(dk));
        this.dapAn = Boolean.valueOf(da);
    }

    public boolean isDapAn() {
        return dapAn;
    }

    public void setDapAn(boolean dapAn) {
        this.dapAn = dapAn;
    }

    public boolean isTraLoi() {
        return traLoi;
    }

    public void setTraLoi(boolean traLoi) {
        this.traLoi = traLoi;
    }

    void nhapCauhoi() {
        Scanner sc = new Scanner(System.in);
        CauHoiDungSai ch1 = new CauHoiDungSai();
        System.out.printf("nhap cau hoi:");
        this.setNoiDung(sc.nextLine());
        System.out.printf("nhap th loai:");
        String tl;
        tl = sc.nextLine();
        this.setTheLoai(theLoai.valueOf(tl));
        System.out.printf("nhap do kho:");
        String dk;
        dk = sc.nextLine();
        this.setDoKho(doKho.valueOf(dk));
        System.out.println("nhap dap an (true hoac false) ");
        String a = sc.nextLine();
        this.dapAn = Boolean.valueOf(a);
        danhsachcauhoitracnghiem.add(ch1);
    }

    void xuatCauHoi() {
        super.xuatCauHoi();
    }

    @Override
    void nhapCauTraLoi() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap cau tra loi");
        String a = sc.nextLine();
        this.traLoi = Boolean.valueOf(a);
    }

    @Override
    boolean testDungSai() {
        if (this.isDapAn() == this.isTraLoi()) {
            return true;
        }
        return false;
    }

    void nhapCauHoiVaoFile() {
        try {
            FileWriter fw = new FileWriter("DanhSachCauHoiTracNghiem.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (CauHoiDungSai ch : danhsachcauhoitracnghiem) {
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
            FileReader fr = new FileReader("DanhSachCauHoiTracNghiem.txt");
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
                danhsachcauhoitracnghiem.add(new CauHoiDungSai(noiDung, theLoai, doKho, dapAn));
                System.out.println(line);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return dstv;
    }

    public String toString1() {
        return noiDung + ";" + theLoai + ";" + doKho + ";" + dapAn;
    }
}
