import java.util.Scanner;
public class Question2{
	public static void main(String args[]){
        int arr[] = new int[20];

   // Array initialization is hidden     

 int x[]= {1,2,3,8,5,2,1,9,45,3,7,2,10,65,4,9,33,12,6,76};
 int y[]= {1,2,3,8,5,2,1,9,45,3,7,324,545,56,78,98,34,22,13,1};
        Scanner sc = new Scanner(System.in);
        if(sc.nextInt()==1){
	    arr = x;
        }else{
            arr = y;
        }
       int temp;
	for(int i=0; i<(arr.length-1);i++){
		if(arr[i]>arr[i+1]){
			temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
	}
	System.out.print(arr[arr.length-1]);
  }
}
