package Car;

public class TaxiCar implements Car {
    public void Move() {
        System.out.println("Taxi Move");
    }

    public void Stop() {
        System.out.println("Taxi Stop");
    }

    public void TurnRight() {
        System.out.println("Taxi Turn Right");
    }

    public void TurnLeft() {
        System.out.println("Taxi Turn Left");
    }

    public void Reverse() {
        System.out.println("Taxi Reverse");
    }
}
