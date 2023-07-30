package btvn0607;

import java.util.ArrayList;

public class Sodoku {

    int[][] sodoku = {{1, 2, 3}, 
                      {2, 0, 1}, 
                      {3, 0, 0}};
    Sodoku(){
    }

    int[][] tinhSodoku() {
        while (_kiemTraOConTrong(sodoku)) {
            this.sodoku = _dienSodokuTheoCot(sodoku);
            this.sodoku = _dienSodokuTheoHang(sodoku);
        }
        return sodoku;
    }

    void hienThiSodoku(){
        for (int hang = 0 ; hang < 3 ; hang++){
            for (int cot = 0;  cot < 3; cot++){
                System.out.printf("%d ",sodoku[hang][cot]);
            }
            System.out.printf("\n");
        }
    }

    boolean _kiemTraOConTrong(int [][] sodoku) {
       
        for (int hang = 0 ; hang < 3 ; hang ++) {
            for (int cot = 0; cot < 3 ; cot++) {
                if (sodoku[hang][cot] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    int[][] _dienSodokuTheoHang(int[][] sodoku) {
        
        for ( int hang = 0; hang < 3; hang++){
            int viTriCot = 0;
            int x = 0;
            int tongHang = 0;
            if(kiemTraHang2soKhong(sodoku[hang])) continue;
            for (int cot = 0 ; cot < 3 ; cot ++ ){
                tongHang = tongHang + sodoku[hang][cot];
                if(sodoku[hang][cot] == 0){
                    viTriCot = cot;
                }
            }
            x = 6 - tongHang;
            sodoku[hang][viTriCot] = x;
        }

        // thay the gia tri tra ve cua ham la sodoku sau khi dien
        return sodoku;
    }

    int[][] _dienSodokuTheoCot(int[][] sodoku) {
         for ( int cot = 0; cot < 3; cot++){
            int viTriHang = 0;
            int x = 0;
            int tongCot = 0;
            ///tao mot mang moi cua cai cot tuong ung
            int[] cotThuIndex = {sodoku[0][cot],sodoku[1][cot], sodoku[2][cot]};
            if(kiemTraHang2soKhong(cotThuIndex)) continue;
            for (int hang = 0 ; hang < 3 ; hang ++ ){
                tongCot = tongCot + sodoku[hang][cot];
                if(sodoku[hang][cot] == 0){
                    viTriHang = hang;
                }
            }
            x = 6 - tongCot;
            sodoku[viTriHang][cot] = x;
        }
        // thay the gia tri tra ve cua ham la sodoku sau khi dien
        return sodoku;
    }
    boolean kiemTraHang2soKhong(int[] mang){
        int dem = 0;
        for(int i = 0; i < 3; i ++){
            if(mang[i] == 0){
                dem++;
            }
        }

        if (dem > 1 || dem == 0) return true;
        return false;
    }
}