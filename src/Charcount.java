import java.util.HashMap;
import java.util.Map;

public class Charcount {

	
	public static void charcnt(String str) {
		Map<Character,Integer> charfreqmap=new HashMap<Character,Integer>();
		if(str!=null)
		{
			char[] chararray=str.toCharArray();
			for(char c:chararray)
			{
				Integer count=charfreqmap.get(c);
				int newcount=(count==null?1:count+1);
				charfreqmap.put(c, newcount);
			}
			System.out.println(charfreqmap);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "My name is shadab";
charcnt(s);
	}

}
