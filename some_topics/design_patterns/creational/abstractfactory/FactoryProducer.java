package abstractfactory;

public class FactoryProducer {


    public static CarFactory getCarFactory(FactoryType factoryType){

        CarFactory carFactory;

        switch (factoryType){

            case Honda:
                carFactory = new HondaCarFactory();
                break;
            case Hyundai:
                carFactory = new HyundaiCarFactory();
                break;
            default:
                carFactory = null;

        }

        return carFactory;

    }

}
