import java.util.*;
import java.lang.*;
import java.io.*;

class Atoi
{
	public int myAtoi(String s)
	{
		long out=0;
		int i=0;
		StringBuilder output=new StringBuilder();
		while(i<s.length()){
		     if(Character.isLetter(s.charAt(i))){
		       return 0;
		    }
		    
		    switch(s.charAt(i)){
		        case '-': i++;
		        System.out.println("inside -:");
		                  break;
		        case ' ':i++;
		        System.out.println("inside space:");
		         break;
		        case '0':i++;
		         System.out.println("inside zero:");
		         break;
		    }
		   
		    while(i<s.length()){
		      if(Character.isDigit(s.charAt(i))){
		      System.out.println("inside int:"+Character.isDigit(s.charAt(i)));
		      output.append(s.charAt(i));
		      i++;
		      }else if(Character.isLetter(s.charAt(i))){
		          return 0;
		      }
		    } 
		    
		     out=(int) Integer.parseInt(output.toString());
		    
		  
		   if (out > Integer.MAX_VALUE || out < Integer.MIN_VALUE) {
            return 0;
        }
        
		}
      return out;
	}
}
