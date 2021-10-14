package Java.OOPConcepts.Encapsulation; /*
 * @Created 14/10/2021/ - 7:18 pm/
 * @project Hacktoberfest21
 * @author sanc on
 */

public class TestEncapsulation {
    public static void main(String[] args)
    {
        Encapsulate obj = new Encapsulate();

        // setting values of the variables
        obj.setName("Harsh");
        obj.setAge(19);
        obj.setRoll(51);

        // Displaying values of the variables
        System.out.println("Techie's name: " + obj.getName());
        System.out.println("Techie's age: " + obj.getAge());
        System.out.println("Techie's roll: " + obj.getRoll());

        // Direct access of geekRoll is not possible
        // due to encapsulation
        // System.out.println("Geek's roll: " +
        // obj.geekName);
    }
}
