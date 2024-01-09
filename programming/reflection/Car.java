package programming.reflection;

public class Car {
    private String carName;

    public Car(){
        this.carName="default carName";
    }

    public Car(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void moveForward(int meter){
        System.out.println(carName+"가 앞으로 "+meter+"만큼 움직입니다.");
    }

    public void moveBackward(int meter){
        System.out.println(carName+"가 앞으로 "+meter+"만큼 움직입니다.");
    }

    public void stop(){
        System.out.println(carName+"가 멈춥니다.");
    }
}
