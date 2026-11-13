
public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0, a, temp;
		int n=153;
		temp=n;
		while(n>0)
		{
			a=n%10;
			c=n/10;
			c=c +(a*a*a);
		}
		if(temp==c)
		
			System.out.println("armstrng");
		
		else
		
			System.out.println("not armstrng");
		
		

	}

}
