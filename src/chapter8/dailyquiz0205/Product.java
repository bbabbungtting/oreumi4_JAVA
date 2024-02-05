package chapter8.dailyquiz0205;

import java.math.BigDecimal;

public class Product implements Promotion{
    private String name;
    private BigDecimal price;
    private Double weight;

    public Product(String name, int price, Double weight) {
        this.name = name;
        this.price = new BigDecimal(price);
        this.weight = weight;
    }

    @Override
    public BigDecimal getDiscountAmount() {
        if(comparePrice(price,100000)>=0){
            return price;
        }
        else if(comparePrice(price,30000)>=0){
            return BigDecimal.valueOf(1000);
        }
        return BigDecimal.ZERO;
    }

    private int comparePrice(BigDecimal price,int standard){
        return price.compareTo(BigDecimal.valueOf(standard));
    }


    public Double getWeight() {
        return weight;
    }
}
