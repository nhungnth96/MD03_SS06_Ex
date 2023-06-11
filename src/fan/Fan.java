package fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean isOn = false;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        this.isOn = on;
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

    public Fan() {
    }

    public String toString() {
        return "Color: " + color + " | Raidus: " + radius + " | Mode:" + isOn + " | Speed:" + speed;
    }

    public void turnOn() {
        System.out.println("Fan is on");
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Radius: " + radius);
    }

    public void turnOff() {
        System.out.println("Fan is off");
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Radius: " + radius);
    }
}