package chapter6;

/*
Write a class that creates instances of the Rectangle class to find the total area of two rooms in a house
 */
public class HomeAreaCalculator {

    public static void main(String[] args) {
        /******** RECTANGLE 1 *******/

        //Create instance of Rectangle class
        Rectangle room1 = new Rectangle();
        room1.setWidth(30);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        double perimeterOfRoom1 = room1.calculatePerimeter();

        /******** RECTANGLE 2 *******/

        //Create instance of Rectangle class
        Rectangle room2 = new Rectangle(30,75);
        double areaOfRoom2 = room2.calculateArea();

        double perimeterOfRoom2 = room2.calculatePerimeter();

        double totalArea = areaOfRoom1 + areaOfRoom2;
        double totalPerimeter = perimeterOfRoom1 + perimeterOfRoom2;

        System.out.println("Area of both rooms: " + totalArea);
        System.out.println("Perimeter of both rooms: " + totalPerimeter);


    }
}
