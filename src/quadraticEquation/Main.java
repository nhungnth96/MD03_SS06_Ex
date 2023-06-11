package quadraticEquation;

import config.InputScanner;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation delta = new QuadraticEquation();
        System.out.println("Nhap a:");
        double a = InputScanner.scanner().nextDouble();
        System.out.println("Nhap b:");
        double b = InputScanner.scanner().nextDouble();
        System.out.println("Nhap c:");
        double c = InputScanner.scanner().nextDouble();
        delta.setA(a);
        delta.setB(b);
        delta.setC(c);
        if (delta.getDiscriminant() > 0) {
            System.out.println("Phuong trinh co 2 nghiem " + "\n" + "Nghiem 1:" + delta.getRoot1() + "\n" + "Nghiem 2:" + delta.getRoot2());
        } else if (delta.getDiscriminant() == 0) {
            System.out.println("Phuong trinh co 1 nghiem duy nhat: " + "\n" + delta.getRoot1());
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
