package Class21;

public class CircleClass extends ShapeClass {
    CircleClass(double radius) {
        super(radius);

    }
    double area;
    void calculateTheArea() {
        this.area = super.p * (super.radius*super.radius);
        System.out.println("The area of circle with radius " + super.radius + " equals to " + area);
    }

    public static void main(String[] args) {
        CircleClass circleClass = new CircleClass(3);
        circleClass.calculateTheArea();
    }

}
