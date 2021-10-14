package Java.OOPConcepts.Polymorphism; /*
 * @Created 14/10/2021/ - 8:08 pm/
 * @project Hacktoberfest21
 * @author sanc on
 */

public class TestPolymorphism {
    public static void main(String[] args)
    {

        Parent a;

        a = new SubClass1();
        a.Print();

        a = new SubClass2();
        a.Print();
    }
}
