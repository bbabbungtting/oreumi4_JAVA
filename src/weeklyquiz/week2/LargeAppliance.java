package weeklyquiz.week2;

import java.math.BigDecimal;

public class LargeAppliance extends Product implements DeliveryChargeCalculator{
    LargeAppliance(String name, int price, double weight){
        super(name,price,weight);
    }

    @Override
    public BigDecimal getDeliveryCharge(BigDecimal weight, BigDecimal price) {
        BigDecimal deliveryCharge = new BigDecimal(0);

        //무게에 따른 배송비 측정
        if (weight.compareTo(WEIGHT_STANDARD_1) < 0) {
            deliveryCharge = deliveryCharge.add(WEIGHT_CHARGE_1);
        } else if (weight.compareTo(WEIGHT_STANDARD_2) < 0) {
            deliveryCharge = deliveryCharge.add(WEIGHT_CHARGE_2);
        } else {
            deliveryCharge = deliveryCharge.add(WEIGHT_CHARGE_3);
        }

        //가격에 따른 할인 측정
        if(price.compareTo(PRICE_STANDARD_2)>ZERO){
            deliveryCharge = deliveryCharge.multiply(PRICE_DISCOUNT_ALL);
        }else if(price.compareTo(PRICE_STANDARD_1) > ZERO){
            deliveryCharge = deliveryCharge.subtract(PRICE_DISCOUNT);
        }

        return deliveryCharge;
    }
}
