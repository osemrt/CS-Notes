package abstractfactory;

public class HyundaiCarFactory implements CarFactory {
    @Override
    public Car createCar(CarType carType) {

        Car car;

        switch (carType){
            case I10:
                car = new I10();
                break;
            case  I20:
                car = new I20();
                break;
            default:
                car = null;
        }


        return car;
    }
}
