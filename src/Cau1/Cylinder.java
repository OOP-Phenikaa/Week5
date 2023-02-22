package Cau1;

// File Cau1.Cylinder.java
public class Cylinder extends Circle {
    private double heigth;

    public Cylinder() {
        super();
        this.heigth = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);
        this.heigth = 1.0;
    }

    public Cylinder(double radius, double heigth) {
        super(radius);
        this.heigth = heigth;
    }

    public Cylinder(double radius, String color, double heigth) {
        super(radius, color);
        this.heigth = heigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getVolume() {
        return getArea() * heigth;
    }

    @Override
    public String toString() {
        return "Cau1.Cylinder[heigth=" + heigth + ", " + super.toString() + "]";
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
}