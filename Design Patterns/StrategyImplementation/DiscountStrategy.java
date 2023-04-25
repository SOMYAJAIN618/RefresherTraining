package StrategyImplementation;
import java.math.BigDecimal;

// Strategy interface
interface DiscountStrategy {
    BigDecimal applyDiscount(BigDecimal amount);
}
class ChristmasDiscount implements DiscountStrategy {
    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.9));
    }
}

class BlackFridayDiscount implements DiscountStrategy {
    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.8));
    }
}

class ShoppingCart {
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public BigDecimal checkout(BigDecimal amount) {
        return discountStrategy.applyDiscount(amount);
    }
}

