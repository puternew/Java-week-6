
package warmup6;


public class Triangle2 extends Triangle implements Comparable<Triangle2>{

    @Override
    public double getPreimeter() {
        double d1 = Math.sqrt(Math.pow(getBase(),2)+Math.pow(getHeight(), 2));
        return d1
                ;
    }
    
    @Override
    public int compareTo(Triangle2 o){
    return getShapeId().compareTo(o.getShapeId());
    }
    
}
