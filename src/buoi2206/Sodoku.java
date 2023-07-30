package buoi2206;

import buoi2206.btvn2206.BookList;

import java.util.ArrayList;

public class Sodoku {
        int sodoku[][] = new int[][]{{1, 2, 3}, {2, 0, 1}, {3, 0, 0}};
        Sodoku(){
        }
        void xuatSodoku(){
                for (int hang = 0 ; hang < 3 ; hang++){
                    for (int cot = 0 ;cot < 3; cot++){

                        if (sodoku[hang][cot] == 0) System.out.printf("x ");
                        else System.out.printf("%d ",sodoku[hang][cot]);
                    }
                    System.out.printf("\n");
                }
        }
        void tinhTongHang(){
            for(int hang = 0 ; hang < 6 ; hang ++){

            }
        }
        void tinhSodoku(){
            int tong = 6 ;
            int hang;
            int cot;
            for(hang = 0 ; hang < 2 ; hang++){
                for (cot = 0 ; cot < 2 ; cot++){
                    int tongHang = 0;
                    if(this.sodoku[hang][cot] == 0){
                        for (cot = 0 ; cot < 2; cot++){
                            tongHang += this.sodoku[hang][cot];
                        }
                      this.sodoku[hang][cot] = tong - tongHang;
                    }
                }
                int tongCot = 0;
                if(this.sodoku[hang][cot] == 0){
                    for (hang = 0 ; hang < 2; hang++){
                        tongCot += this.sodoku[hang][cot];
                    }
                    this.sodoku[hang][cot] = tong - tongCot;
                }
            }
        }

    public static void main(String[] args) {
        Sodoku sodoku1 = new Sodoku();
        sodoku1.xuatSodoku();
        sodoku1.tinhSodoku();
        System.out.printf("sau khi tính la x\n");
        sodoku1.xuatSodoku();
    }

}
