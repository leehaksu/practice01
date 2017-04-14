package practice01;



public class Prob5 {

	public static void main(String[] args) {
				
		for(int i =1;i<=99;i++)
		{
			String num=String.valueOf(i);
			
			System.out.print(num+ " ");
			for(int j=0;j<num.length();j++)
			{
				char c=num.charAt(j);
				if(c=='3' || c=='6' || c=='9')
				{
					System.out.print("짝");
				}
				
				
			}
			System.out.println();
		}
		

	}
}