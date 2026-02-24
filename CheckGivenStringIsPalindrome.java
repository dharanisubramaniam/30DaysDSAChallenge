import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 String x= "madam";
        
        if(x.length()<1){
            System.out.println("Inavlid input");
        }

        //using string builder
         StringBuilder stringBuilder = new StringBuilder(x);
        String result = stringBuilder.reverse().toString();
        
        System.out.println(result);
        
        boolean isPalindrome = (x.equals(result))?true:false;
        if(isPalindrome){
            System.out.println("The given string is palindrome");
        }else{
            System.out.println("The given string is not palindrome");
        }

        
        
        //using loop -my version
       
        int j=0;
        int i=x.length()-1;
        while(j<i){
            if(x.charAt(i)==x.charAt(j)){
                i--;
                j++;
                
            }else{
                System.out.println("The given string is not palindrome");
                return;
            }
            
          
        }
       System.out.println("The given string is palindrome");   
       
        //*********the correct version runs the loop only until middle*******
        int left = 0, right = x.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (x.charAt(left) != x.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
	}
       


	}

