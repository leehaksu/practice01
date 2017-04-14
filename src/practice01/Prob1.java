package practice01;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력하시오 :");
		try{
			int num = sc.nextInt();
			System.out.println(num);
			
			if(num%3==0)
			{
				System.out.println("3의 배수 입니다.");
			}else
			{
				System.out.println("3의 배수가 아닙니다.");
			}
			
		}catch(Exception e)
		{
		}finally
		{
			sc.close();
		}
		

	}
}
