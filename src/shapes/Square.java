package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public double getArea() {
        System.out.println("override: ");
        double side = this.length;
        return Math.pow(side, 2);
    }

    public double getPerimeter() {
        System.out.print("override: ");
        double side = this.length;
        return 4 * side;
    }
    
}
