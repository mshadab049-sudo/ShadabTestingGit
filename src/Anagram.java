import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="motherinlaw";
		String str2="hitlerwoman";
		String s1= str1.replaceAll("\\s", "");
		String s2= str2.replaceAll("\\s", "");
		boolean b;
		
		if(s1.length()!=s2.length())
		{
			b=false;
		}
		else
		{
			char[] arrays1=s1.toLowerCase().toCharArray();
			char[] arrays2=s2.toLowerCase().toCharArray();
			Arrays.sort(arrays1);
			Arrays.sort(arrays2);
			b=Arrays.equals(arrays1, arrays2);
		}
		if(b)
		{
			System.out.println("str1" + "and" + "str2" + "are anagrams");
		}
		else
		{
			System.out.println("s1" + "and" + "s2" + "are not anagrams");
		}
	}

}
