package EmailValidation;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email 
{
	   public static void main(String args[])
	   {  
	       ArrayList<String> m = new ArrayList<String>();  
	       
	       m.add("firstName@domain.co.in");  
	       m.add("firstName@domain.com");  
	       m.add("firstName.name@domain.com");  
	       m.add("firstName#@domain.co.in");  
	       m.add("firstName@domain.com");  
	       m.add("firstName@domaincom");
	       
	       //Add invalid emails in list  
	       m.add("@yahoo.com");  
	       m.add("firstName#domain.com");
	       
	       //Regular Expression  
	       String regex = "^(.+)@(.+)$";  
	       
	       //Compile regular expression to get the pattern  
	       Pattern pattern = Pattern.compile(regex);
	       
	       //Iterate emails array list  
	       for(String email : m)
	       {  
	           //Create instance of matcher  
	           Matcher matcher = pattern.matcher(email); 
	           
	           System.out.println(matcher.matches());
	           //System.out.println(Mail +" : "+ matcher.matches());  
	       }  
	   }  
	} 
