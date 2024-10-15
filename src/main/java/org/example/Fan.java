package org.example;

public class Fan {
    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte speed;

    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;

    }

    public static void main(String[] args) {
        Fan fan = new Fan("Manufacture", 20.5, "white");

        fan.switchOn();
        fan.switchOff();
        fan.speedIs((byte) 23);
        fan.switchOff();
        System.out.println(fan);

    }

    public void speedIs(byte sp) {
        this.speed = sp;
    }

    public void switchOff() {
        this.isOn = false;
        speedIs((byte) 0);
    }

    public void switchOn() {
        this.isOn = true;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public byte getSpeed() {
        return speed;
    }

    public void setSpeed(byte speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "make='" + make + '\'' +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", isOn=" + isOn +
                ", speed=" + speed +
                '}';
    }
}
