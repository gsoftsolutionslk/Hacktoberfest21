
public class Switch{

    public static void main(String args[]){
        
        Scanner scn = new Scanner(System.in);
             
             System.out.println("Enter a letter");
                 char letter= scn.next().charAt(0);
                 
    switch (letter) {
        
        case 'a': case 'A':
        case 'e': case 'E':
        case 'i': case 'I':
        case 'o': case 'O':
        case 'u': case 'U':
          
          System.out.println("\nVowel\n");
          
          break;
          
        default:
          System.out.println("\nConsonant\n");
    }
    
    }
    }
    