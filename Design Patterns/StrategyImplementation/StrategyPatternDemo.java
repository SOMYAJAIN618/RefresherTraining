package StrategyImplementation;

import java.math.BigDecimal;


public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        BigDecimal totalAmount = BigDecimal.valueOf(100);

        // Applying Christmas discount
        DiscountStrategy christmasDiscount = new ChristmasDiscount();
        cart.setDiscountStrategy(christmasDiscount);
        BigDecimal discountedAmount = cart.checkout(totalAmount);
        System.out.println("Total amount with Christmas discount: " + discountedAmount);

        // Applying Black Friday discount
        DiscountStrategy blackFridayDiscount = new BlackFridayDiscount();
        cart.setDiscountStrategy(blackFridayDiscount);
        discountedAmount = cart.checkout(totalAmount);
        System.out.println("Total amount with Black Friday discount: " + discountedAmount);
    }
}
