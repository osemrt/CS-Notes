package visitor.CreditCards;

import visitor.Offers.Visitor;

public class Gold implements CreditCard {
    @Override
    public String getName() {
        return "Gold";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitGold(this);
    }
}
