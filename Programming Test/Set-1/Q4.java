import java.util.Scanner;
public class Question4{
	public static void main(String args[]){
Scanner sc = new Scanner(System.in);
char ch = sc.next().charAt(0);

char con[] = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};

int flag = 0;

for (int i=0; i < con.length; i++){
    if(con[i] == ch){
        flag = 1;
        break;
    }
  }
if(flag == 1){
   System.out.println("Consonant");
}
  }
}
