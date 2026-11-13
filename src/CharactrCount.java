import java.util.HashMap;

public class CharactrCount {

	public static void charcnt(String str)
	{
		HashMap<Character,Integer> charfreqmap=new HashMap<>();
		if(str!=null)
		{
			char[] chararray=str.toCharArray();
			for(char c:chararray )
			{
				Integer count=charfreqmap.get(c);
				int newcount=(count==null?1:count+1);
				charfreqmap.put(c, newcount);
			}
			System.out.println(charfreqmap);
		}
	}
	
	public static void charactercnt(String str)
	{
		HashMap<Character,Integer> charfreqmap=new HashMap<>();
		if(str!=null)
		{
			char[] chararray=str.toCharArray();
			for(char c:chararray)
			{
				if(charfreqmap.containsKey(c))
				{
					charfreqmap.put(c, charfreqmap.get(c)+1);
				}
				else
				{
					charfreqmap.put(c, 1);
				}
			}
		}
		System.out.println(charfreqmap);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="i am automation engineer";
charactercnt(str);
	}

}
