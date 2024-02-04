package weeklyquiz.week2;

import java.math.BigDecimal;

public interface DeliveryChargeCalculator {
    int ZERO = 0;
    BigDecimal WEIGHT_STANDARD_1 = new BigDecimal(3000);
    BigDecimal WEIGHT_STANDARD_2 = new BigDecimal(100000);

    BigDecimal WEIGHT_CHARGE_1 = new BigDecimal(1000);
    BigDecimal WEIGHT_CHARGE_2 = new BigDecimal(5000);
    BigDecimal WEIGHT_CHARGE_3 = new BigDecimal(10000);

    BigDecimal PRICE_STANDARD_1 = new BigDecimal("30000");
    BigDecimal PRICE_STANDARD_2 = new BigDecimal("1000000");
    BigDecimal PRICE_DISCOUNT = new BigDecimal("1000");
    BigDecimal PRICE_DISCOUNT_ALL = new BigDecimal("0");

        default BigDecimal getDeliveryCharge(BigDecimal weight, BigDecimal price) {
        BigDecimal deliveryCharge = new BigDecimal(0);

        //무게에 따른 배송비 측정
        if (weight.compareTo(WEIGHT_STANDARD_1) < ZERO) {
            deliveryCharge = deliveryCharge.add(WEIGHT_CHARGE_1);
        } else if (weight.compareTo(WEIGHT_STANDARD_2) < ZERO) {
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

    public void show();
}
