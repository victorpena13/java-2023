package shapes;

public class Square extends Quadrilateral{
    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public double getArea() {
        System.out.println("override: ");
        return Math.pow(this.side, 2);
    }

    public double getPerimeter() {
        System.out.print("override: ");
        return 4 * this.side;
    }

    void setLength() {
        this.length = side;
        
    }

    void setWidth() {
        this.width = side;
        
    }
    
}
