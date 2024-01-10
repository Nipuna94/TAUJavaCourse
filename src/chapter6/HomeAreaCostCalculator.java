package chapter6;

public class HomeAreaCostCalculator {
    public static double cost = 55;
    public static Rectangle room1 = new Rectangle();

    public static void main(String[] args) {
        System.out.println(areaOfRoom1());
        System.out.println(costOfRoom1(areaOfRoom1()));
    }

    public static double areaOfRoom1() {
        room1.setLength(100);
        room1.setWidth(85);
        double areaOfRoom1 = room1.calculateArea();
        return areaOfRoom1;
    }

    public static double costOfRoom1(double areaOfRoom1) {
        double costOfRoom1 = areaOfRoom1 * cost;
        return costOfRoom1;
    }
}
