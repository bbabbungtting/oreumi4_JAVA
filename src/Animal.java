public class Animal {
    private String name;
    private boolean isAwake;
    private boolean isDangerous;

    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Animal();
        animals[0].setName("tiger");
        animals[0].setDangerous(true);
        animals[0].sleep();

        animals[1] = new Animal();
        animals[1].setName("giraffes");
        animals[1].setDangerous(false);

        animals[2] = new Animal();
        animals[2].setName("lion");
        animals[2].setDangerous(true);

        animals[3] = new Animal();
        animals[3].setName("elephant");
        animals[3].setDangerous(false);
        animals[3].sleep();

        animals[4] = new Animal();
        animals[4].setName("bear");
        animals[4].setDangerous(true);

        System.out.print("오늘 관람 가능한 동물은 ");
        for(Animal animal : animals){
            if(animal.getIsAwake()){
                System.out.print(animal.getName()+" ");
            }
        }
        System.out.println("입니다.");

        System.out.print("그중에 어린이가 조심해야 할 동물은 ");
        for(Animal animal : animals){
            if(animal.getIsAwake() && animal.getIsDangerous()){
                System.out.print(animal.getName()+" ");
            }
        }
        System.out.println("입니다.");

    }

    Animal(){
        isAwake = true;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sleep(){
        isAwake = false;
    }
    public void wakeUp(){
        isAwake = true;
    }
    public boolean getIsAwake(){
        return isAwake;
    }

    public void setDangerous(boolean danger){
        isDangerous = danger;
    }
    public boolean getIsDangerous(){
        return isDangerous;
    }
}
