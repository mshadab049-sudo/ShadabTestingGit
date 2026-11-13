import java.util.HashMap;
import java.util.Map;

public class wordcount {

	public static void wordcountternany(String str)
	{
		HashMap<String,Integer> charwordmap=new HashMap<>();
		if(str!=null)
		{
			String[] words=str.split(" ");
			for(String word:words)
			{
				Integer count=charwordmap.get(word);
				int newcount= (count==null?1:count+1);
				charwordmap.put(word, newcount);
			}
		}
		System.out.println(charwordmap);
			}
	public static void wordcount(String str)
	{
		HashMap<String,Integer> charwordmap=new HashMap<>();
		if(str!=null)
		{
			String[] words=str.split(" ");
			for(String word:words)
			{
				if(charwordmap.containsKey(word))
				{
					charwordmap.put(word, charwordmap.get(word)+1);
				}else
				{
					charwordmap.put(word, 1);
				}
			}
		}
		System.out.println(charwordmap);
			}
	
	public static void Duplicateandcount(String str)
	{
		HashMap<String,Integer> charwordmap=new HashMap<>();
		if(str!=null)
		{
			String[] words=str.split(" ");
			for(String word:words)
			{
				if(charwordmap.containsKey(word))
				{
					charwordmap.put(word, charwordmap.get(word)+1);
				}else
				{
					charwordmap.put(word, 1);
				}
			}
		}
		for(Map.Entry<String, Integer> entry: charwordmap.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
		
			}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="my name is shadab shadab";
		wordcountternany(str);
		wordcount(str);
		Duplicateandcount(str);
}
}