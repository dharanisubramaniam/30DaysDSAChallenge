import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr={1,3,5,6};
		
		int target=7;
		
		int start=0;
		int end=arr.length-1;
		int mid=0;
		
		while(start<=end){
		    mid=(start+end)/2;
		    if(arr[mid]==target){
		       return mid;
		    }else if(arr[mid]>target){
		        end=mid-1;
		    }else if(arr[mid]<target){
		        start=mid+1;
		    }
		}
     return start;
	}
}
