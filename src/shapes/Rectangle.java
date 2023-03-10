package shapes;

public class Rectangle extends Quadrilateral  {


    public Rectangle(double length, double width){
        super(length, width);
    }
    

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (2*length)+(2*width);
    }
}