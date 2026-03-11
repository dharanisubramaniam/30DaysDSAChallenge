import java.util.*;
import java.lang.*;
import java.io.*;

class PalindromeNumber
{
	public void isPalindrome(int x)
	{
		 //int x=121;
        if(x<0){System.out.println("false");};
        int result =0;
        int reminder=0;
        int temp=x;
        while(x>0){
            reminder = x%10;
            System.out.println("reminder:"+reminder);
            x=x/10;
             System.out.println("x:"+x);
            result=(result*10)+reminder;
            System.out.println("result:"+result);
            
        }
        if(temp==result){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        

	}
}
