package designPattern;
/*
    팩토리 패턴
    객체를 사용하는 코드에서 객체 생성부분을 떼어내 추상화한 패턴이자 상속 관계에 있는 두 클래스에서
    상위 클래스가 중요한 뼈대를 결정하고, 하위 클래스에서 객체 생성에 관한 구체적인 내용을 결정하는 패턴
    장점)
    - 상위 클래스와 하위 클래스가 분리되기 때문에 느슨한 결합을 가지며, 상위 클래스에서는 인스턴스 생성 방식에 대해 전혀 알 필요가 없어 더 많은 유연성을 가진다.
    - 코드를 리팩토링하더라도 한 곳만 수정하면 되므로 유지 보수성이 증가

 */
abstract class Coffee{
    public abstract int getPrice();

    @Override
    public String toString(){
        return "Hi this coffee is " + this.getPrice();
    }
}

class CoffeeFactory{
    public static Coffee getCoffee(String type, int price){
        if("Latte".equalsIgnoreCase(type))
            return new Latte(price);
        else if("Americano".equalsIgnoreCase(type))
            return new Americano(price);
        else{
            return new DefaultCoffee();
        }
    }
}

class DefaultCoffee extends Coffee{
    private int price;

    public DefaultCoffee(){
        this.price=-1;
    }

    @Override
    public int getPrice(){
        return price;
    }
}

class Latte extends Coffee{
    private int price;

    public Latte(int price){
        this.price = price;
    }

    @Override
    public int getPrice(){
        return price;
    }
}

class Americano extends Coffee{
    private int price;

    public Americano(int price){
        this.price=price;
    }

    @Override
    public int getPrice(){
        return price;
    }
}

public class FactoryTest {
    public static void main(String[] args) {
        Coffee latte = CoffeeFactory.getCoffee("Latte", 4000);
        Coffee ame = CoffeeFactory.getCoffee("Americano", 3000);
        System.out.println("Factory latte :: "+latte);
        System.out.println("Factory ame :: "+ame);
    }
}
