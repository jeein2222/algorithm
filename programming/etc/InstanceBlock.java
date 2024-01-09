package programming.etc;

public class InstanceBlock {
    public static void main(String[] args) {
        Car myCar = new Car(); //인스턴스 생성
        System.out.println(myCar.getCurrentSpeed()); //인스턴스 메서드 호출
    }
}


class Car{
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;

    private int currentSpeed;

    {   //인스턴스 초기화 블록
        this.currentSpeed=0;
    }

    Car() {}

    public Car(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
