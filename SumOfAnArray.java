import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//sum of all elements in an array
		int[] num={56,890,12,3,0};
		if(num.length<1){
		    System.out.println("Inavlid input");
		    return;
		}
		int sum=0;
		for(int i : num){
		    sum+=i;
		}
		System.out.println("sum:"+sum);
		
	 
		

	}
}
