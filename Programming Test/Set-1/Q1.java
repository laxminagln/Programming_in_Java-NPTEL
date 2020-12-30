import java.util.Scanner;
public class Question1{
	public static void main(String args[]){
        int n;
Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
                int sum=0;
		int i=1;
		while(i>0){
			if(n==0){break;}
			if(i%2==0){
				sum= sum+i;
				n--;
			}
			i++;
		}
		System.out.print(sum);
    } // main() ends here
} // class Question1 ends here
