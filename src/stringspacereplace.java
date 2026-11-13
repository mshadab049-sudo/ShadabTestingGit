
public class stringspacereplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="i<>*&^% am@#@#%$ shadab";
//String str2= str.replace(" ", "*");
String str3=str.replaceAll("[^a-zA-Z0-9]", "");
System.out.println(str3);
		
		// Get the String
      /*  String str = "Geeks Gor Geeks";
 
        // Get the index
        int index = 6;
 
        // Get the character
        char ch = '*';
 
        // Print the original string
        System.out.println("Original String = " + str);
        //str = str.substring(0, 8);
        str = str.substring(0, index) + ch
              + str.substring(index - 1);
 
        // Print the modified string
        System.out.println("Modified String = " + str);*/
	}

}
