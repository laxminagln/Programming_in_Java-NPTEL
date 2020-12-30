import java.util.Scanner;
public class Question2{
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
         int i;
         int s;
      //define size of array
       s = input.nextInt();
     //The array is defined "arr" and elements are of  integer type.
      int[] arr = new int[s];   
      for(i=0;i<arr.length;i++){
	   arr[i]=input.nextInt();
       } 

       int min=arr[0]; 
       for(i=1;i<arr.length;i++){ 
            if(arr[i]<min)
            min =arr[i];
       }
	
    System.out.print(min);
    }
}
