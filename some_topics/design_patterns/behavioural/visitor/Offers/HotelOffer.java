package visitor.Offers;

import visitor.CreditCards.Bronze;
import visitor.CreditCards.Gold;
import visitor.CreditCards.Silver;

public class HotelOffer implements Visitor {
    @Override
    public void visitBronze(Bronze bronze) {
        System.out.println("We are computing the cashback for a bronze card buying hotel");
    }

    @Override
    public void visitGold(Gold gold) {
        System.out.println("We are computing the cashback for a gold card buying hotel");
    }

    @Override
    public void visitSilver(Silver silver) {
        System.out.println("We are computing the cashback for a silver card buying hotel");
    }
}
