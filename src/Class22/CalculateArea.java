package Class22;

public class CalculateArea {
    /*Create 1 class in which create a method that will calculate the area (volume) of
    Rectangle
    Square
    Box
    Use separate class to test your code*/

    double getArea(double width) {
        return  width * width;

    }

    double getArea(double width, double length) {
        return width * length;
    }

    double getArea(double width, double length, double heigth) {
        return width * length * heigth;
    }



    public static void main(String[] args) {
        CalculateArea rectangle = new CalculateArea();
        CalculateArea square = new CalculateArea();
        CalculateArea box = new CalculateArea();

        System.out.println("Area of the square " + square.getArea(3));
        System.out.println("Area of the rectangle " + rectangle.getArea(3, 9));
    }

}

