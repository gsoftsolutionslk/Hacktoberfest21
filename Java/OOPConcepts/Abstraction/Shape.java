package Java.OOPConcepts.Abstraction; /*
 * @Created 14/10/2021/ - 10:43 pm/
 * @project Hacktoberfest21
 * @author sanc on
 */

// Java program to illustrate the
// concept of Abstraction
abstract class Shape {
    String color;

    // these are abstract methods
    abstract double area();
    public abstract String toString();

    // abstract class can have the constructor
    public Shape(String color)
    {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    // this is a concrete method
    public String getColor() { return color; }
}