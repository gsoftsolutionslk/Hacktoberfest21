import java.util.Scanner;

public class Gpa {
     
    public void myMethod(int x){
        Scanner scan = new Scanner(System.in);
        
        int NoOfSub = x;
        int i;
        String studentMark[] = new String[NoOfSub]; 
        float courseCredit[] =  new float[NoOfSub];
        float tMark = 0f,tCredit = 0f; 
        
            System.out.println("-----|||||           Grades and Credits You can have          |||||-----");
            System.out.println("-----||||| A+ | A | A- | B+ | B | B- | C+ |C-| C | D+ | D-| E |||||-----");
            System.out.println("-----|||||                  1 | 2 | 3 | 4                     |||||-----"); 
            System.out.println();          
           
            for(i=0;i<NoOfSub;i++){                    //Loop Block to Get the marks,credit and assign values
                //Getting The credit of Each Subject 
                System.out.print("Enter the credit of the Subject : ");          //This is for Credits
                courseCredit[i] = scan.nextFloat();               //Getting Credits from User
                tCredit += courseCredit[i];                 //Addition of *Credits
            
                System.out.print("Enter the Grade of Subject No "+(i+1)+"(Grd in latter) : ");       //This is for Marks 
                studentMark[i] = scan.next();                //Getting the Value of the subject
             
                    //This set of code is for 1 credit Subjects
                    if(courseCredit[i]==1){
                        switch(studentMark[i].toLowerCase()){ // Converstion of Char Grades into Marks and Addition
                            case "a" : case "a+":{  
                                tMark += 4f;
                                break;
                                }
                            case "a-":{
                                tMark += 3.7f;
                                break;
                                }
                            case "b+":{
                                tMark += 3.3f;
                                break;
                                }
                            case "b":{
                                tMark += 3f;
                                break;
                                }
                            case "b-":{
                                tMark += 2.7f;
                                break;
                                }
                            case "c+":{
                                tMark += 2.3f;
                                break;
                                }
                            case "c":{
                                tMark += 2f;
                                break;
                                }
                            case "c-":{
                                tMark += 1.7f;
                                break;
                                }
                            case "d+":{
                                tMark += 1.3f;
                                break;
                                }
                            case "d":{
                                tMark += 1f;
                                break;
                                }
                            case "e":{
                                tMark += 0f;
                                break;
                                }
                        }        
                    }                 
                    //This set of Code is for 2 Credit Subjects   
                    else if(courseCredit[i]==2){
                        switch(studentMark[i].toLowerCase()){   // Converstion of Char Grades into Marks and Addition
                            case "a" : case "a+":{  
                                tMark += 4f*2;
                                break;
                                }
                            case "a-":{
                                tMark += 3.7f*2;
                                break;
                                }
                            case "b+":{
                                tMark += 3.3f*2;
                                break;
                                }
                            case "b":{
                                tMark += 3f*2;
                                break;
                                }
                            case "b-":{
                                tMark += 2.7f*2;
                                break;
                                }
                            case "c+":{
                                tMark += 2.3f*2;
                                break;
                                }
                            case "c":{
                                tMark += 2f*2;
                                break;
                                }
                            case "c-":{
                                tMark += 1.7f*2;
                                break;
                                }
                            case "d+":{
                                tMark += 1.3f*2;
                                break;
                                }
                            case "d":{
                                tMark += 1f*2;
                                break;
                                }
                            case "e":{
                                tMark += 0f;
                                break;
                                }
                        }  
                    }  
                    //This is set of code is for 3 Credit Subjects 
                    else if(courseCredit[i]==3){
                        switch(studentMark[i].toLowerCase()){ // Converstion of Char Grades into Marks and Addition
                            case "a" : case "a+":{  
                                tMark += 4f*3;
                                break;
                                }
                            case "a-":{
                                tMark += 3.7f*3;
                                break;
                                }
                            case "b+":{
                                tMark += 3.3f*3;
                                break;
                                }
                            case "b":{
                                tMark += 3f*3;
                                break;
                                }
                            case "b-":{
                                tMark += 2.7f*3;
                                break;
                                }
                            case "c+":{
                                tMark += 2.3f*3;
                                break;
                                }
                            case "c":{
                                tMark += 2f*3;
                                break;
                                }
                            case "c-":{
                                tMark += 1.7f*3;
                                break;
                                }
                            case "d+":{
                                tMark += 1.3f*3;
                                break;
                                }
                            case "d":{
                                tMark += 1f*3;
                                break;
                                }
                            case "e":{
                                tMark += 0f;
                                break;
                                }
                        }  
                    }  
                    //This is Set of code is for 4 Credit Subjects
                    else if(courseCredit[i]==4){
                        switch(studentMark[i].toLowerCase()){ // Converstion of Char Grades into Marks and Addition
                            case "a" : case "a+":{  
                                tMark += 4f*4;
                                break;
                                }
                            case "a-":{
                                tMark += 3.7f*4;
                                break;
                                }
                            case "b+":{
                                tMark += 3.3f*4;
                                break;
                                }
                            case "b":{
                                tMark += 3f*4;
                                break;
                                }
                            case "b-":{
                                tMark += 2.7f*4;
                                break;
                                }
                            case "c+":{
                                tMark += 2.3f*4;
                                break;
                                }
                            case "c":{
                                tMark += 2f*4;
                                break;
                                }
                            case "c-":{
                                tMark += 1.7f*4;
                                break;
                                }
                            case "d+":{
                                tMark += 1.3f*4;
                                break;
                                }
                            case "d":{
                                tMark += 1f*4;
                                break;
                                }
                            case "e":{
                                tMark += 0f;
                                break;
                            }
                        }  
                    }          
            }
                
                
                System.out.println("\n");
                System.out.println("-----||||| Result |||||-----");
                System.out.printf("       TotalMarks : %.1f  \n       Total Credits : %d\n",tMark,(int)tCredit);
                System.out.printf("----------------------------\n       Final GPA : %.2f\n",(tMark/tCredit));
                System.out.print("----------------------------\n----------------------------");
                
                
            scan.close();
    }
}



//Have a little logic concern need to clear it♥           So Far Changed It...  