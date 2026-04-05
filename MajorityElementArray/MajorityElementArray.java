import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	int[] nums={2,2,1,1,1,2,2};
	int n=nums.length;
    int majElement=0;
    int count=0;
    
    for(int i=0;i<n;i++){
       if(count==0){
          majElement=nums[i];
       }
       if(nums[i]==majElement){
           count++;
       }else{
           count--;
       }
        
    }
		System.out.println("Majority Element:"+majElement);

	}
}
