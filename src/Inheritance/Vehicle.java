package Inheritance;

public class Vehicle {

    private String name;
    private int currentVelocity;
    private float speed;

    public Vehicle(String name, int currentVelocity) {
        this.name = name;
        this.currentVelocity = currentVelocity;
    }

    void steering() {
        System.out.println("Steering called, you drive with speed of: " + speed + " km/h");
    }

    void increaseSpeed(int speed) {
        this.currentVelocity += speed;
    }

    void decreaseSpeed(int speed) {
        this.currentVelocity -= speed;
    }

    void changeGear() {

    }
}
