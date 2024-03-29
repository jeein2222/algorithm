package programming.burgerqueen.product.subproduct;

import programming.burgerqueen.product.Product;


//버거 클래스
public class Hamburger extends Product {

    private boolean isBurgerSet;
    private int burgerSetPrice;

    public Hamburger(int id, String name, int price, int kcal,boolean isBurgerSet, int burgerSetPrice) {
        super(id, name, price, kcal);
        this.isBurgerSet = isBurgerSet;
        this.burgerSetPrice = burgerSetPrice;
    }

    public Hamburger(Hamburger hamburger){//깊은 복사를 해주는 복사 생성자
        super(hamburger.getName(), hamburger.getPrice(), hamburger.getKcal());
        this.isBurgerSet=hamburger.isBurgerSet();
        this.burgerSetPrice=hamburger.getBurgerSetPrice();
    }

    public boolean isBurgerSet() {
        return isBurgerSet;
    }

    public void setIsBurgerSet(boolean burgerSet) {
        isBurgerSet = burgerSet;
    }

    public int getBurgerSetPrice() {
        return burgerSetPrice;
    }

    public void setBurgerSetPrice(int burgerSetPrice) {
        this.burgerSetPrice = burgerSetPrice;
    }
}
