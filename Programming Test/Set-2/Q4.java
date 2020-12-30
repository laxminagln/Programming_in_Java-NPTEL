import java.util.Scanner;
public class Question4{
    public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);

      char c = sc.next().charAt(0);
       if(c=='e' || c=='E'|| c=='a' || c=='A' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U') 
	{
	   System.out.print("vowel");
	}  
	else
	   System.out.print("Not_vowel");
        }
    }
