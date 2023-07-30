package buoi1206.baitvn1206;

public class Sodoku {
    public static void main(String[] args) {

        int sodoku[][] = {{1, 2,3}, {2,-1,1}, {3,-1,-1}};
        for(int hang = 0; hang < 3 ; hang++){
            for (int cot = 0; cot < 3 ; cot++){
                System.out.printf("%d",sodoku[hang][cot]);
            }
            System.out.printf("\n");
        }
        for(int hang = 0; hang < 4 ; hang++){
            for (int cot = 0; cot < 4 ; cot++){
                if(sodoku[hang][cot] == -1){
                    int tong =0;
                   for(cot = 0 ; cot < 4; cot++){
                       if(sodoku[hang][cot] == -1) {
                           continue;
                       }
                       tong += sodoku[hang][cot];
                   }
                   sodoku[hang][cot] =( 6- tong);
                }
            }
        }
        for(int hang = 0; hang < 3 ; hang++){
            for (int cot = 0; cot < 3 ; cot++){
                System.out.printf("%d",sodoku[hang][cot]);
            }
            System.out.printf("\n");
        }
    }
    }