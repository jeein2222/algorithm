package designPattern;

/*
    전략 패턴
    객체의 행위를 바꾸고 싶은 경우 '직접' 수정하지 않고 전략이라고 부르는 '캡슐화한 알고리즘'을 컨텍스트 안에서 바꿔주면서 상호 교체가 가능하게 만드는 패턴
    컨텍스트 : 상황, 맥락, 문맥을 의미하며, 개발자가 어떠한 작업을 완료하는 데에 필요한 모든 관련 정보.
 */

import java.util.ArrayList;
import java.util.List;

interface PaymentStrategy{
    public void pay(int amount);
}

class KakaoCardStrategy implements PaymentStrategy{
    private String name;
    private String cardNumber;
    private String csv;
    private String dateOfExpiry;

    public KakaoCardStrategy(String name, String cardNumber, String csv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.csv = csv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount){
        System.out.println(amount + " paid using KakaoCard.");
    }
}

class LunaCardStrategy implements PaymentStrategy{
    private String emailId;
    private String password;

    public LunaCardStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount){
        System.out.println(amount + " paid using LunaCard.");
    }
}

class Item{
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }
}

class ShoppingCart{
    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int sum=0;
        for(Item item:items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}

public class StrategyTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item A = new Item("apple", 100);
        Item B = new Item("banana", 200);

        cart.addItem(A);
        cart.addItem(B);

        cart.pay(new LunaCardStrategy("jeein@naver.com", "1234"));
        cart.pay(new KakaoCardStrategy("jeein", "123456789", "123", "12/01"));

    }
}
