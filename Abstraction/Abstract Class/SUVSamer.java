public abstract class SUVSamer extends Car{
    @Override
    void autopilot() {
        System.out.println("SUVSamer autopilot");
    }

    abstract void streamingServices();

    abstract void parkingSensors();
}
