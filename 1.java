import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag=0;
		do{
			int n = sc.nextInt();
			if(n%9==0)
				System.out.println(9);
			else if(n%9==9)
				System.out.println(0);
			else
				System.out.println(n%9);
			System.out.println("enter 1 to exit");
			flag = sc.nextInt();
		}while(flag==0);
		
	}
}