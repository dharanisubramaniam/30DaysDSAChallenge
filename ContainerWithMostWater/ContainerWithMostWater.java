import java.util.*;
import java.lang.*;
import java.io.*;

class ContainerWithMostWater
{
	public int maxArea(int[] arr)
	{
		int i=0;
		int j=arr.length-1;
		int area=0;
		int finalArea=0;
		
		while(i<j && i<arr.length && j>0){
		    int smallerElement = arr[i]<arr[j]?arr[i]:arr[j];
		        area=smallerElement*(j-i);
		        if(area>finalArea){
		            finalArea=area;
		        }
		   if(arr[i+1]>arr[j]){
		       i++;
		   }else{
		       j--;
		   }
		    
		}
 return finalArea;
	}
}
