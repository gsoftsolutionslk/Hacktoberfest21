import java.util.Scanner;

public class LoanCalculator
{
	public static void main(String[] args) {
        double TotaltoPay = 0;
        double pay=0;
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Loan amount: ");
		double amount = scanner.nextInt();
        System.out.print("Enter your Loan monthly Interest (As Percentage): ");
		double interest = scanner.nextInt();
        System.out.print("Enter your Loan period: ");
		double period = scanner.nextInt();
        System.out.println("Loan settlement Frequencies:");
        System.out.println("Please press 1 for Monthly");
        System.out.println("Please press 2 for Quartly");
        System.out.println("Please press 3 for Annually");
        System.out.print("Please select your Loan settlement Frequency:");
		int frequency = scanner.nextInt();
		for(int i=0 ; i<3 ; i++){
            TotaltoPay= (amount+(amount*interest)/100);
            if(frequency == 1){
                pay = TotaltoPay / (12*period);
            }
            else if(frequency == 2){
                pay = TotaltoPay / (6*period);
            }
            else if(frequency == 3){
                pay = TotaltoPay/(period);
            }
            else {
                System.exit(0);
            }
		}
            System.out.println("Finally You have to pay : "+TotaltoPay+ " for settle your loan.");
            System.out.println("According to your loan settlement frequency, You have to pay : "+pay+ ".");
	}
}