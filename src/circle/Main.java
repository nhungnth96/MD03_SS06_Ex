package circle;

import config.InputScanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Nhap vao ban kinh:");
        double radius = InputScanner.scanner().nextDouble();
        circle.setRadius(radius);
        System.out.println("Nhap vao mau sac:");
        String color = InputScanner.scanner().nextLine();
        circle.setColor(color);
        circle.display();
        System.out.println("Chu vi: " + circle.chuVi());
        System.out.println("Dien tich: " + circle.dienTich());

    }

}
