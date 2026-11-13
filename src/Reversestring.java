
public class Reversestring {

	public static void main(String[] args) {
		String str="my name is shadab";
		String strrev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			strrev=strrev+str.charAt(i);
		}
System.out.println("reverse string:" +strrev);
	}

}
