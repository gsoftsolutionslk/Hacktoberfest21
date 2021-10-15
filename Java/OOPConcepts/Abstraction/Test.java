package Java.OOPConcepts.Abstraction; /*
 * @Created 14/10/2021/ - 10:46 pm/
 * @project Hacktoberfest21
 * @author sanc on
 */

public class Test {
    public static void main(String[] args)
    {
        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
