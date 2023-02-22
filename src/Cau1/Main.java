package Cau1;

// File Cau1.Main.java
public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "blue");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(2.0, "blue", 3.0);
        System.out.println(cylinder);
    }
}