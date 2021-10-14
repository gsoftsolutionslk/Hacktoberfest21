package Java.OOPConcepts.Abstraction; /*
 * @Created 14/10/2021/ - 10:45 pm/
 * @project Hacktoberfest21
 * @author sanc on
 */

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius)
    {

        // calling Shape constructor
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override double area()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override public String toString()
    {
        return "Circle color is " + super.getColor()
                + "and area is : " + area();
    }
}