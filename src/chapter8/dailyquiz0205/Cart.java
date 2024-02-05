package chapter8.dailyquiz0205;

import java.math.BigDecimal;

public class Cart {
    Product[] products;

    Cart(Product[] products){
        this.products = products;
    }

    BigDecimal calculateDeliveryCharge(){
        BigDecimal charge = BigDecimal.ZERO;

        for(Product product : products){
            charge = charge.add(deliveryCharge(product.getWeight()));
            charge = charge.subtract(product.getDiscountAmount());
        }

        return charge;
    }

    private BigDecimal deliveryCharge(double weight){
        if(weight < 3){
            return BigDecimal.valueOf(1000);
        }
        else if(weight<10){
            return BigDecimal.valueOf(5000);
        }
        return BigDecimal.valueOf(10000);
    }
}
