package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        Circle c1 = new Circle(3.5);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());

        boolean yesNo;

        do{
            System.out.print("radius: ");
            double userRadius = input.getDouble();
            Circle c2 = new Circle(userRadius);
            System.out.println("area: " + c2.getArea());   
            System.out.println("perimeter: " + c2.getCircumference());     
            yesNo = input.yesNo();
            yesNo = input.yesNo();
        } while(yesNo == true);



        




    }
    
}
