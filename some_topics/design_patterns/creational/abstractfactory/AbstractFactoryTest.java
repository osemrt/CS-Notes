package abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {


        CarFactory carFactory1 = FactoryProducer.getCarFactory(FactoryType.Honda);

        Car car1 = carFactory1.createCar(CarType.Brio);
        car1.drive();

        Car car2 = carFactory1.createCar(CarType.City);
        car2.drive();


        CarFactory carFactory2 = FactoryProducer.getCarFactory(FactoryType.Hyundai);

        Car car3 = carFactory2.createCar(CarType.I10);
        car3.drive();

        Car car4 = carFactory2.createCar(CarType.I20);
        car4.drive();



    }

}
