
package warmup6;


public class Circle2 extends Circle{

    public Circle2() {
    }

    public Circle2(double radius) {
        super(radius);
    }
    
    public double getPerimeter(){
        return 2*Math.PI*getRadius();
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
