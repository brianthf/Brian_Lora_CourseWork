package com.company.concreteapproach;

/*Task:
 *
 */
public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double area() {
        double p = perimeter() / 2;

        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p-sideC));
    }


    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }


}
