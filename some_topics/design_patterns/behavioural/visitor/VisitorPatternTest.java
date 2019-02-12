package visitor;

import visitor.CreditCards.Bronze;
import visitor.CreditCards.CreditCard;
import visitor.CreditCards.Gold;
import visitor.CreditCards.Silver;
import visitor.Offers.GasOffer;
import visitor.Offers.HotelOffer;
import visitor.Offers.Visitor;

public class VisitorPatternTest {

    public static void main(String[] args) {

        CreditCard creditCard1 = new Bronze();
        CreditCard creditCard2 = new Gold();
        CreditCard creditCard3 = new Silver();

        Visitor visitor1 = new GasOffer();
        Visitor visitor2 = new HotelOffer();


        creditCard1.accept(visitor1);
        creditCard2.accept(visitor1);
        creditCard3.accept(visitor1);

        creditCard1.accept(visitor2);
        creditCard2.accept(visitor2);
        creditCard3.accept(visitor2);



    }


}
