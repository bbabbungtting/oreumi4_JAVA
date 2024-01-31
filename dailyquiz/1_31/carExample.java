public class CarExample {
    public static void main(String[] args) {
        Car[] cars = new Car[6];

        cars[0] = new Car("hyundai", 5);
        cars[1] = new Car("benz", 2);
        cars[2] = new Car("bmw", 3);
        cars[3] = new Car("porsche", 1);
        cars[4] = new Car("ferrari", 2);
        cars[5] = new Car();

        for(Car car : cars){
            car.showSpec();
        }
    }
}

public class Car {
    String name;
    double efficiency;

    public Car() {
        this.name = "달구지";
        efficiency = howEfficiency();
    }

    public Car(String name, int upgrade) {
        this.name = name;
        efficiency = howEfficiency() * upgrade;
    }

    private double howEfficiency() {
        switch (name) {
            case :
                "hyundai":
                return 12.5;
            case :
                "benz":
                return 17.5;
            case :
                "bmw":
                return 22.5;
            case :
                "porsche":
                return 27.5;
            case :
                "ferrari":
                return 32.5;
            default:
                return 7.5;
        }
    }

    public void showSpec() {
        System.out.println("이름 : " + name + " 연비 : " + efficiency);
    }

}