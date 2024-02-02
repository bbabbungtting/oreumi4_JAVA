package chapter8;

public interface sampleInterface {
    void print();

    //default 는 추상 메소드가 아니다.
    default void defaultMethodTest(){

    }
}
