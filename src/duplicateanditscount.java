import java.util.HashMap;
import java.util.Map;

public class duplicateanditscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="My name is shadab shadab shadab";
HashMap<Character, Integer> map=new HashMap<>();
if(str!=null)
{
	char[] chararr=str.toCharArray();
	for(char c:chararr)
	{
		if(map.containsKey(c))
		{
			map.put(c, map.get(c)+1);
		} else
		{
			map.put(c, 1);
		}
	}
}
//System.out.println(map);
for(Map.Entry<Character, Integer> entry: map.entrySet())
{
	if(entry.getValue()>1)
		System.out.print(entry.getKey()+" "+entry.getValue());
}
	}

}
