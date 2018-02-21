package warmup6;

public abstract class Square extends Shape {

    private double side;

    public Square() {
    }

    public Square(double side, String shapeId) {
        super(shapeId);
        this.side = side;
    }

    @Override
    public double getArea() {
        return 0;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }

}
