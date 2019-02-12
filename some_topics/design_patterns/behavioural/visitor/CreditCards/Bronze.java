package visitor.CreditCards;

import visitor.Offers.Visitor;

public class Bronze implements CreditCard {
    @Override
    public String getName() {
        return "Bronze";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBronze(this);
    }
}
