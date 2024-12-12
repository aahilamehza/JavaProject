package scannerprograms;

public class stirngpg
{
	public static void main(String[] args) 
	{
		//concat
		String s="Hello ";
		String s1="Aahila saman";
		String s2="Hello ";
		System.out.println(s.concat(s1));        // Hello Aahila saman
		System.out.println(s+s1);                // Hello Aahila saman
		System.out.println(2+3+s+5+6);           // 5Hello 56
		
		
		//equals equalsIgnoreCase
		System.out.println(s.equals(s1));                    //false
		System.out.println(s.equalsIgnoreCase(s2));          //true
		System.out.println(s.equals(2));                     //false
		
		
		//toUpper toLower
		System.out.println(s.toUpperCase());                 //HELLO
		System.out.println(s1.toUpperCase());                //HELLO
		System.out.println(s1.toLowerCase());                //aahila saman
		
		
		
		//length
		System.out.println(s1.length());                      //12
		
		
		//startsWith endsWith
		System.out.println(s.startsWith("Hello"));                 //true
		System.out.println(s1.startsWith("Hello"));                 //false
		System.out.println(s1.endsWith("saman"));                  //false
			
		
		//contains
		System.out.println(s1.contains("saman"));   //true
		
		
		//trim
		String s3= "               WELCOME           ";
		String s4= s+s3;
		System.out.println(s4);
		String s5= s3.trim();
		System.out.println(s+s5);
		
		
		//replace
		String s6= "God is Great";
		System.out.println(s6.replace("Great","Love"));
		
		
		//substring
		System.out.println(s6.substring(7));
		System.out.println(s6.substring(0, 3));
		
		//split
		String s7="Hello luminar technolab";
		String[] st=s7.split("");
		for(String e:st)
		{
			System.out.println(e);
		}
	
		//toCharArray
		String s8= "HELLO";
		char[] c=s8.toCharArray();
		for(char ele:c)
		{
			System.out.println(ele);
		}
		
		
	}

}
