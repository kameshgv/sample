import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		/*int[] arr= {5,9,8};
		for(int value:arr)
		{
			System.out.println(value);
		}
		*/
		int[]arr=new int[3];
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the array values");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		scan.close();
		for(int value:arr)
			System.out.println(value);
		
		
		
	}
	}