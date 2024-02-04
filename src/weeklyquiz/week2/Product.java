package weeklyquiz.week2;

import java.math.BigDecimal;

import static java.lang.String.valueOf;

public class Product{
    private String name;
    private BigDecimal price;
    private BigDecimal weight;
    protected BigDecimal deliveryCharge;

    Product(String name, int price, double weight){
        this.name = name;
        this.price = new BigDecimal(price);
        this.weight = new BigDecimal(valueOf(weight));
    }

    public void showProduct(){
        System.out.println("상품명 : " + name + " | 가격 : " + price + " | 무게 : " + weight);
    }

    public void showDeliveryCharge(BigDecimal charge){
        System.out.println("배송 가격은 : " + charge + " 입니다.");
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
