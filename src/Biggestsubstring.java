
public class Biggestsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="my name is shadab";
int maxlenght=0;
String longest="";
if(str!=null)
{
	String[] substrings=str.split(" ");
	for(int i=1;i<=substrings.length-1;i++)
	{
		if(substrings[i].length()>maxlenght)
		{
			maxlenght=substrings[i].length();
			longest=substrings[i];
		}
	}
}
System.out.println("longest substring is:" +longest);
	}

}
