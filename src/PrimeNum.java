import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		PrimeNum p=new PrimeNum();
		String status=p.prime(13);
		System.out.println(status) ;
		/*int i,no,fect=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		no=s.nextInt();
		if(no==1)
		{
			System.out.println("smallest prime number is 2");
		}
		for(i=2;i<no;i++)
		{
			if(no%i==0)
			{
				System.out.println("Not prime");
				break;
			}
		}
		if(no==i)
		{
			System.out.println("Prime number");
		}
*/
	}
	
	public String prime(int num)
	{
		String status = null;
			int i;
		if(num==0 || num==1)
		{
			status="smallest prime number is 2";
		}
		for(i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				status="Not prime";
				break;
			}else 
			{
				status="Prime number";
			}
		}
		
		return status;
		
	}

}
