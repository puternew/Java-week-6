
package warmup6;


public abstract class Shape {
    private String  shapeId;

    

    public Shape() {
    }

    public Shape(String shapeId) {
        this.shapeId = shapeId;
    }

    public abstract double getArea();
    public abstract double getPreimeter();

    public String getShapeId() {
        return shapeId;
    }

    public void setShapeId(String shapeId) {
        this.shapeId = shapeId;
    }

    @Override
    public String toString() {
        return "Shape{" + "shapeId=" + shapeId +'}';
    }

}
