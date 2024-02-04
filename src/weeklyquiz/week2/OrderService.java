package weeklyquiz.week2;

import java.util.ArrayList;

public class OrderService {
    public static void main(String[] args) {

        ArrayList<DeliveryChargeCalculator> products = new ArrayList<>();

        products.add(new Grocery("carrot",25000,25000.0));
        products.add(new Beauty("CHANEL NO.5",130000,500.0));
        products.add(new LargeAppliance("refrigerator",450000,120000.0));

        for(DeliveryChargeCalculator product : products){
            product.show();
        }
    }
}
