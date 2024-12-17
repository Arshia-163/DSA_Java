package pack.oops.Interface_java;

public class Car implements Engine,Brake ,Media{

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

    @Override
    public void brake() {
        System.out.println("Car has brakes");
    }
    
}
