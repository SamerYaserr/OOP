public class Main{
    public static void main(String[] args) {
        SUV car1 = new SUV(100, 400, 4);
        car1.autopilot();

        Car car2 = new Hatchback();
        car2.autopilot();

        Car car3 = new SUV(100, 400, 4);
        car3.streamingServices();
    }
}