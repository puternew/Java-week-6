/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup6;

/**
 *
 * @author INT105
 */
public abstract class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle() {
    }

    public Triangle(double base, double height, String shapeId) {
        super(shapeId);
        this.base = base;
        this.height = height;
    }
    @Override
    public double getArea() {
        return (1.0/2)*base*height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", height=" + height +getShapeId()+'}';
    }


}
