package weeklyquiz.week2;

public class Beauty extends Product implements DeliveryChargeCalculator{
    Beauty(String name, int price, double weight){
        super(name,price,weight);
        deliveryCharge = getDeliveryCharge(this.getWeight(),this.getPrice());
    }

    @Override
    public void show(){
        super.showProduct();
        super.showDeliveryCharge(deliveryCharge);
    }

}
