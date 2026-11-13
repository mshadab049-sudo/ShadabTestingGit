import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
Scanner n=new Scanner(System.in);
System.out.println("Enter the number:");
num=n.nextInt();
if(num%2==0)
{
	System.out.println("It is an even number");
}else
{
	System.out.println("It is an odd number");
}
	}

}
