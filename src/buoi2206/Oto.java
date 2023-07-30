package buoi2206;

import java.util.Scanner;

public class Oto extends MayMoc implements Icar {
    String name;
    String producer;
    int year;
    int seat;
    float rootPrice;

    Oto() {
    }
    Oto( String name, String producer, int year, int seat, float rootPrice){
    }

    void setName(String name) {
        this.name = name;
    }

    void setProducer(String producer) {
        this.producer = producer;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setSeat(int seat) {
        this.seat = seat;
    }

    void setRootPrice(float rootPrice) {
        this.rootPrice = rootPrice;
    }

    String getName() {
        return this.name;
    }

    String getProducer() {
        return this.producer;
    }

    int getYear() {
        return this.year;
    }

    int getSeat() {
        return this.seat;
    }

    float getRootPrice() {
        return this.rootPrice;
    }


    public float calculateTax() {
        float tax;
        if (this.seat < 7) {
            tax = this.rootPrice * (6 / 10);
        } else tax = this.rootPrice * (7 / 10);
        return tax;
    }

    public float calculatePrice() {
        float totallPrice = this.rootPrice + calculateTax();
        return totallPrice;
    }


    public void setIntFor() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ten xe:\n");
        this.setName(sc.nextLine());
        System.out.printf("nhap nha san xuat:\n");
        this.setProducer(sc.nextLine());
        System.out.printf("nhap so cho ngoi:\n");
        this.setSeat(sc.nextInt());
        System.out.printf("nhap nam san xuat:\n");
        this.setYear(sc.nextInt());
        System.out.printf("nhap gia chua tinh thue");
        this.setRootPrice(sc.nextFloat());
    }

    public void getInfor() {
        System.out.printf("xe %s san xuat boi %s trong nam %d co %d co gia bao gom ca thue la %f $", this.getName(), this.getProducer(), this.getYear(), this.getSeat(), this.calculatePrice());
    }
}
