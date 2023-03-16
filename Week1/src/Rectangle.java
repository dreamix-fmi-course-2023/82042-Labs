public class Rectangle implements GeometricObject{
    private double width;
    private double height;

    Rectangle(){
        setHeight(1);
        setWidth(1);
    }

    Rectangle(double newWidth, double newHeight){
        setWidth(newWidth);
        setHeight(newHeight);
    }

    public void setWidth(double newWidth){
        if(newWidth != 0)
            this.width = newWidth;
    }

    public void setHeight(double newHeight){
        if(newHeight != 0)
            this.height = newHeight;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }
    @Override
    public double getArea() {
        return getHeight() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getHeight() + getWidth());
    }

    @Override
    public String toString() {
        return "Area is: " + getArea() + "\n" + "Perimeter is: " + getPerimeter();
    }
}
