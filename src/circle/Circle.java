package circle;

public class Circle {
    public double radius;
    public String color;
    final double PI = 3.14159;

    public Circle() {
    }

    ;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
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

    public double chuVi() {
        return (radius * 2) * PI;
    }

    public double dienTich() {
        return Math.pow(radius, 2) * PI;
    }

    public void display() {
        System.out.println(
                "Hinh tron cua ban:" + "\n" + "radius: " + radius + "cm" +
                        " | color: " + color
        );
    }

}
