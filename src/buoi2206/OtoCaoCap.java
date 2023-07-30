package buoi2206;

import java.util.Scanner;

public class OtoCaoCap extends Oto{
    float speciallRate = 80;

    @Override
    public float calculatePrice() {
        float totallPrice = this.rootPrice + this.calculateTax() + this.rootPrice * speciallRate;
        return totallPrice;
    }
    public float calculatePrice(float transprotCost) {
        float totallPrice = this.rootPrice + this.calculateTax() + this.rootPrice * speciallRate + transprotCost;
        return totallPrice;
    }
}
