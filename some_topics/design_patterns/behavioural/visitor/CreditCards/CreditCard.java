package visitor.CreditCards;

import visitor.Offers.Visitor;

public interface CreditCard {
    public String getName();
    public void accept(Visitor visitor);
}
