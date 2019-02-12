package visitor.CreditCards;

import visitor.Offers.Visitor;

public class Silver implements CreditCard {
    @Override
    public String getName() {
        return "Silver";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSilver(this);
    }
}
