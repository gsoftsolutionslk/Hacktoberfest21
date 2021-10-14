package Java.OOPConcepts.Inheritance; /*
 * @Created 14/10/2021/
 * @project Hacktoberfest21
 * @author Naresh chandanbatve
 */




/// for method overloading  /// overloading bark(); method 
class dog_1{

         public void bark() { 
        	   System.out.println("dog is barking");
         }
         
         public void bark(int x) {
        	 System.out.println("Dog having "+x+" legs is barking loudly.");
        	 }
}



/// method overriding 
class cat_1{
	
	public void sound() {
		System.out.println("This is the sound of a cat ");
	}
	
}


/// overriding sound(); method in cat_1 superclass and lion child class
class lion extends cat_1{
	
	public void sound() {
		System.out.println("This is the sound of a lion");
	}
     
}


/// driver class ///
public class polymorphism {

	   
	   public static void main(String args[]) {
		   
		   dog_1 d1 = new dog_1();
		   d1.bark();
		   d1.bark(4);
		   
		   System.out.println();
		   cat_1 c1 = new cat_1();
		 
		   
		   System.out.println();
		     
		  cat_1 l1 = new lion(); 
		  l1.sound();
		   
		   
	   }
	
}	
