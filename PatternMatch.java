/*(Pattern Matching):
(1) validate the given email id (that shoud have pattern with @ and .com    
    (a)  firstname@gmail.com
    (b)  virendra@gmail.com
    (c)  test123prepare@co.edu.com
(2) validate the phone number with country code +91 pattern mathing
(3) password with 10 length that shoud have - first letter caps  / contain 3 digits / contains any number of alpahbets also 
*/

package PatternMatching;

import java.util.regex.Pattern;

public class PatternMatch 
{
	 public static void main(String args[]) 
	    { 
	        // Following line prints "true" because the whole text "geeksforgeeks" matches pattern "geeksforge*ks" 
	        System.out.println (Pattern.matches("geeksforge*ks", "geeksforgeeks"));
	        
	        System.out.println(Pattern.matches("^\\d{10}$", "7595454544"));
	    }
}
