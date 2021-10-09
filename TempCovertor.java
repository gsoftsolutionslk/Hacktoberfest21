
public class TempCovertor {

    public int F_to_C(float x) {
        float y= 5*(x-32)/9;
            System.out.println("\nVALUE IN CELSIUS: "+y +"\n");
    return 0;
    }    

    public int C_to_F(float x) {
        float y=((x*9)/5)+32;
            System.out.println("\nVALUE IN FAHRENHEIT: "+y +"\n");
    return 0;
    }     

public static void main(String[] args) {
    int d;
    char op;
        Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter \'C\' if you need to convert Fahrenheit to Celsius");
            System.out.println("Enter \'F\' if you need to convert Celsius to Fahrenheit");
        op = sc.next().charAt(0);

            System.out.println("Enter value you need to convert");
        d= (int) sc.nextFloat();

            if(op=='C'){
                TempCovertor obj1 = new TempCovertor();
                obj1.F_to_C(d);
            }

            if(op=='F'){
                TempCovertor obj1 = new TempCovertor();
                obj1.C_to_F(d);
            }
}   }
  
    

      