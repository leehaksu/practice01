package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum=0;
		try
		{
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		if(num%2==0)
		{
			for(int i=0;i<=num;i+=2)
			{
				sum+=i;
				if(i==num)
				{
					System.out.println(i);
				}else
				{
					System.out.print(i+"+");
				}
			}
		}else
		{
			for(int i=1;i<=num;i+=2)
			{
				sum+=i;
				if(i==num)
				{
					System.out.println(i);
				}else
				{
					System.out.print(i+"+");
				}
				
			}
			
		}

		}catch(Exception e)
		{
			
			
		}finally
		{
			System.out.println("="+sum);
			sc.close();
		}
		
	}
}
