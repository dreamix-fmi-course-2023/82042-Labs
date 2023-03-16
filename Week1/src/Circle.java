
public class Circle implements GeometricObject{
    private double radius;

    Circle(double newRadius){
        setRadius(newRadius);
    }

    Circle(){
        setRadius(1);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        if(newRadius != 0)
            this.radius = newRadius;
    }

    @Override
    public double getArea() {
        return 3.14 * this.getRadius() * this.getRadius();
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * this.getRadius();
    }

    @Override
    public String toString() {
        return "Area is: " + getArea() + "\n" + "Perimeter is: " + getPerimeter();
    }
}
