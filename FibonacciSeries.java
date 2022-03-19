package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNum=0;
		int secNum=1;
		int range=8;
		System.out.println(firstNum);
		for(int i=1;i<range;i++)
		{
			int sum=secNum+firstNum;	
			firstNum=secNum;
			secNum=sum;
			System.out.println(sum);
			
		}

	}

}
