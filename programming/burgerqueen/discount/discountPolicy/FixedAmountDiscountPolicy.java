package programming.burgerqueen.discount.discountPolicy;

//고정 금액 할인 정책
public class FixedAmountDiscountPolicy implements DiscountPolicy{
    //할인 금액
    private int discountAmount;

    //생성자
    public FixedAmountDiscountPolicy(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    //할인 적용 금액을 계산하는 메서드
    public int calculateDiscountedPrice(int price){
        return price - discountAmount;
    }
}
