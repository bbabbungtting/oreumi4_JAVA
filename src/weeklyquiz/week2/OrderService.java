package weeklyquiz.week2;

import java.util.ArrayList;

public class OrderService {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Grocery("carrot",25000,25000.0));
        products.add(new Beauty("CHANEL NO.5",130000,500.0));
        products.add(new LargeAppliance("refrigerator",450000,120000.0));

        for(Product product : products){
            product.showProduct();
        }

        Grocery apple = new Grocery("Apple",25000,100);
        Beauty Chanel = new Beauty("CHANEL NO.5",130000,500.0);
        LargeAppliance refrigerator = new LargeAppliance("refrigerator",450000,120000.0);

        System.out.println(apple.getDeliveryCharge(apple.getWeight(),apple.getPrice()));
        System.out.println(Chanel.getDeliveryCharge(Chanel.getWeight(),Chanel.getPrice()));
        System.out.println(refrigerator.getDeliveryCharge(refrigerator.getWeight(),refrigerator.getPrice()));

    }
}
