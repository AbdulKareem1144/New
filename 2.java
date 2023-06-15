import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int[][] arr = new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		spiral(rows,cols,arr);
	}
	static void spiral(int rows,int cols,int[][] arr){
		if(rows%2==0 || cols%2==0)
			return;
		int midR = rows/2;
		int midC = cols/2;
		System.out.print(arr[midR][midC]+" ");
		while(midC>0)
		{
			midC--;
			System.out.print(arr[midR][midC]+" ");
		}
		while(midR<rows-1)
		{
			midR++;
			System.out.print(arr[midR][midC]+" ");
		}
		while(midC<cols-1)
		{
			midC++;
			System.out.print(arr[midR][midC]+" ");
		}
		while(midR>0)
		{
			midR--;
			System.out.print(arr[midR][midC]+" ");
		}
		while(midC>0)
		{
			midC--;
			System.out.print(arr[midR][midC]+" ");
		}
	}
}