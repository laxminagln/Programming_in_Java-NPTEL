import java.util.Scanner;
interface Number {
    int findCube(int i);  // Returns the cube of a number
}

class A implements Number {
  	//Define a method to find the cube of a number
	 int i, cube;
	 public int findCube(int i) {
		 cube=i*i*i;
            return cube;		 
      }
}

public class Question5{ 
     public static void main (String[] args){ 
           A a = new A();   //Create an object of class A
           // Read a number from the keyboard
           Scanner sc = new Scanner(System.in);  
           int n = sc.nextInt();
           System.out.print(a.findCube(n)); 
    } 
}
