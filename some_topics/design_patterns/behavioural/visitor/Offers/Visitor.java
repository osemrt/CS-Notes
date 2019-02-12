package visitor.Offers;

import visitor.CreditCards.Bronze;
import visitor.CreditCards.Gold;
import visitor.CreditCards.Silver;

public interface Visitor {
    public void visitBronze(Bronze bronze);
    public void visitGold(Gold gold);
    public void visitSilver(Silver silver);
}
