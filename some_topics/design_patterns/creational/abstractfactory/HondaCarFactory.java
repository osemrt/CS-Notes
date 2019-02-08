package abstractfactory;

public class HondaCarFactory implements CarFactory {
    @Override
    public Car createCar(CarType carType) {

        Car car;

        switch (carType){
            case Brio:
                car = new Brio();
                break;
            case City:
                car = new City();
                break;
            default:
                car = null;
        }


        return car;
    }
}
