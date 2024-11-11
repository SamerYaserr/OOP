public class Main {

    public static void main(String[] args) {
        CarV1 c1 = new CarV1();
        
        GenericInterface <Car> carV1Obj = new Car();
        Car car = carV1Obj.carModel();
    }
}
