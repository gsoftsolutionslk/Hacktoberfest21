import java.util.Scanner;

public class StuRep {
    public void mainStu(int x){
        Scanner scan = new Scanner(System.in);
        int noOfSub = x;
        float mark[] = new float[noOfSub];
        float total = 0;
        float max = 0 , min = 0 ;

        for(int i=0;i<noOfSub;i++){
            System.out.printf("Enter the marks of the Subject "+(i+1)+" : ");
                mark[i] = scan.nextFloat();           //Getting User Inputs for Marks
                total += mark[i];                     // Addition of the * marks together
                
                // Getting Max 
            if(max<mark[i]){
                max = mark [i];
            }    
        }
                //Getting Min Marks
            min = mark[0];      //Assigning First Value of the Array to Min Value at the begining
        for(int j=0;j<noOfSub;j++){
            if(min>mark[j]){
                min = mark[j];
            }
        }
        System.out.println("-----::::: Result :::::-----");
        System.out.printf("\nTotal Marks : %d \n",(int)total);
        System.out.printf("Average Marks : %.2f \n",(total/noOfSub));
        System.out.printf("Highest Marks : %d \n",(int)max);
        System.out.printf("Lowest Marks : %d \n",(int)min);
        System.out.println("-----::::::::::::::::::-----");

        scan.close();
    }
    
}
