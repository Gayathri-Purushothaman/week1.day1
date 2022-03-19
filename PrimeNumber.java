package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input=10;
boolean flag=false;
int i;
for( i=2;i<input;i++)
{
	int remainder=input%i;
	if(remainder==0)
	{
		flag=true;
	}
}
		if(flag==false)
		{
			System.out.println(input+"is a Prime Number");
		}
		else
		{
			System.out.println(input+"is not a prime number");
		}

	}

}
