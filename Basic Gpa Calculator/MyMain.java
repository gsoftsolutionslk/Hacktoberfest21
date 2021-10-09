import java.util.Scanner;

public class MyMain{
    
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);
        
        String select;
            System.out.println(":::::|||||          Welcome To AJ App           |||||:::::");
            System.out.println(":::::||||| GPA CALCULATOR | STUDENT REPORT CARD |||||:::::");
            System.out.println("Select what You Want : (GPA/SRC)");
            select=myObj.nextLine();
                   
        
        switch(select.toLowerCase()){
            case "gpa":                         //This Case is to user select and input gpa and Subject count
            case "gpa calculator" : 
            {
                Gpa stu = new Gpa();            
                    System.out.println("Enter the Amount of Subjects You have: ");
                        int noOfSub = myObj.nextInt();
                stu.myMethod(noOfSub); 
                break;
                } 
            case "report sheet" : 
            case "report" : 
            case "src" : 
            {
                StuRep stu1 = new StuRep();
                    System.out.println("Enter the Amount of Subjects you have : ");
                    int x = myObj.nextInt();
                stu1.mainStu(x);
            }
        }
        System.out.println("\n-----|||||Thanks for Using My Calculator.. IM ♠AJ'AY♠|||||-----");
        myObj.close();
    }

}