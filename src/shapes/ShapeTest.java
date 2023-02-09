package shapes;

import javax.security.sasl.RealmCallback;

public class ShapeTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        Quadrilateral box2 = new Square(5);

        System.out.println(box1.getArea());
        System.out.println(box2.getPerimeter());

        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());

        System.out.println(box2.getArea());
        System.out.println(box2.getPerimeter());

        System.out.println(box2.getArea());

        Measurable myShape = new Square(8);
        Quadrilateral myShapeTwo = new Rectangle(3, 5);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getClass());
        // System.out.println(myShape.getLength()); // cannot be accessed because it is of the interface type measurable. 
        System.out.println(myShapeTwo.getLength());

        System.out.println(myShapeTwo.getClass() + " " + " ")
    }
    
}
