package Temp;
//import the scanner from the library
import java.util.Scanner;

public class temp {

        public static void main(String[] args) {

            //include Scanner to collect data from the user
            Scanner input = new Scanner(System.in);
            int value; //get the  Fahrenheit degree value from user
            float cel; //Celsius value
            System.out.println("Enter the  Fahrenheit degree value: ");
            value = input.nextInt();

            //convert fahrenheit value to celsius
            cel = ((value-32)*5)/9;

            //print the result
            System.out.println("Celsius value of the input is: " +cel);

        }
    }


