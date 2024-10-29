package pack.Interface_java;

public class PowerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("This car has autostart");
    }

    @Override
    public void stop() {
        System.out.println("Car stop normally");
    }

    @Override
    public void acc() {
        System.out.println("accelerate with speed");
    }
    
}
