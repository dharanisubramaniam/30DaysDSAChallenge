import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] nums1={1,2,2,1};
		int[] nums2={2,2};
		
		HashSet<Integer> set = new HashSet<>();   
		HashSet<Integer> list = new HashSet<>();
		
		
		for(int i:nums1){
		    set.add(i);
		}
		
		for(int j:nums2){
		    if(set.contains(j)){
		        list.add(j);
		    }
		}
System.out.println("output list:"+list);
 int[] out =new int[list.size()];
 int k=0;
 for(int i:list){
     out[k]=i;
     k++;
 }
	}
}
