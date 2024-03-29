package programming.burgerqueen;

import programming.burgerqueen.discount.discountCondition.CozDiscountCondition;
import programming.burgerqueen.discount.Discount;
import programming.burgerqueen.discount.discountCondition.DiscountCondition;
import programming.burgerqueen.discount.discountCondition.KidDiscountCondition;
import programming.burgerqueen.discount.discountPolicy.FixedAmountDiscountPolicy;
import programming.burgerqueen.discount.discountPolicy.FixedRateDiscountPolicy;
import programming.burgerqueen.product.ProductRepository;

//애플리케이션 의존관계 설정 클래스
public class AppConfigurer {
    private Cart cart = new Cart(productRepository(), menu());//싱글톤 패턴
    public ProductRepository productRepository(){
        return new ProductRepository();
    }
    public Menu menu(){
        return new Menu(productRepository().getAllProducts());
    }

    public Cart cart(){
        return cart;
    }

    public Discount discount(){
        return new Discount(new DiscountCondition[]{
                new CozDiscountCondition(new FixedRateDiscountPolicy(10)),
                new KidDiscountCondition(new FixedAmountDiscountPolicy(500))
        });
    }

    public Order order(){
        return new Order(cart(), discount());
    }
}
